//通过node的模块操作，对外暴露了一个配置对象
//指定入口和出口
const path = require('path')
//在内存中，根据指定的模板页面，生成一份内存中的首页，同时自动把打包好的bundle注入到页面的底部
//如果要配置插件，则要在导出的对象中挂载一个plugins节点
const htmlWebpackPlugin = require('html-webpack-plugin')

//Vue Loader v15现在需要一个附带的webpack插件才能正常工作
const VueLoaderPlugin = require('vue-loader/lib/plugin');

module.exports= {
    entry: path.join(__dirname, './src/main.js'), //入口，表示要使用webpack打包的对应文件
    output: {   //输出文件的相关配置
        path: path.join(__dirname, './main.js'),
        filename: 'bundle.js'
    },
    plugins : [  //所有webpack 插件配置节点
                new htmlWebpackPlugin({
                    template : path.join(__dirname, './src/index.html'), //指定模板文件路径
                    filename : 'index.html' //设置生成的内存页面名称
                }),
                new VueLoaderPlugin(),
    ],
    module : { //配置所有第三方loader模块的匹配规则
        rules : [
            {test : /\.css$/, use : ['style-loader', 'css-loader']} ,//处理css文件类型的loader
            {test : /\.less$/, use : ['style-loader', 'css-loader', 'less-loader']} ,//处理less文件类型的loader
            {test : /\.scss$/, use : ['style-loader', 'css-loader', 'sass-loader']} ,//处理sass文件类型的loader
            //处理图片路径
            {test : /\.(jpg|png|gif|bmp|jpeg)$/, use : 'url-loader'} ,
            //处理.vue文件的loader
            {test : /\.vue$/, use : 'vue-loader'},
            {test:/.(png|gif|jpg|svg|ttf)$/, use:['file-loader']}
        ]
    }
}