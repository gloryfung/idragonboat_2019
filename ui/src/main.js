// main.js 是项目js的入口

// 1. 导入jquery
import $ from 'jquery'
import './css/index.css'
import './css/index.scss'

import Vue from 'Vue'
//导入App.vue组件，默认webpack无法打包.vue文件，需要安装相关的loader :
//cnpm i vue-loader vue-template-compiler -D
//在配置文件中，新增loader的配置项
import home from './home.vue'

// import VUeRouter from 'vue-router'
//手动安装router
// Vue.use(VUeRouter)

//导入Mint-UI
import MintUI from 'mint-ui'
//这里可以省略 node_modules这层目录 
import 'mint-ui/lib/style.css'
//将MintUI安装到Vue中
Vue.use(MintUI)

// $(function() {
//     $('li:odd').css('backgroundColor','whrite');
//     $('li:even').css('backgroundColor','blue');
// })

var vm = new Vue({
    el : "#app",
    // data : {
    //     msg : '123'
    // },
    // render : function(createElements) {
    //     return createElements(home)
    // }
    render : c => c(home) //相当于上面的写法

}) 