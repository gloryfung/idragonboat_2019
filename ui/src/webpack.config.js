//通过node的模块操作，对外暴露了一个配置对象
//指定入口和出口
var path = require('path')

//当以命令形式运行webpack或webpack-dev-server的时候，工具会发现并没有要打包的文件的入口和出口文件，
//此时会检查项目根目录中的配置文件，并读取这个文件，拿到 导出 这个配置对象，然后根据这个对象进行打包构建。
module.exports= {
    entry: path.join(__dirname, './src/main.js'), //入口，表示要使用webpack打包的对应文件
    output: {   //输出文件的相关配置
        path: path.join(__dirname, './main.js'),
        filename: 'bundle.js'
    }
}