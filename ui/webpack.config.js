//通过node的模块操作，对外暴露了一个配置对象
//指定入口和出口
const path = require('path')

module.exports= {
    entry: path.join(__dirname, './src/main.js'), //入口，表示要使用webpack打包的对应文件
    output: {   //输出文件的相关配置
        path: path.join(__dirname, './main.js'),
        filename: 'bundle.js'
    }
}