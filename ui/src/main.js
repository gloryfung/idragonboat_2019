// main.js 是项目js的入口

// 1. 导入jquery
import $ from 'jquery'
import './css/index.css'
import './css/index.scss'

$(function() {
    $('li:odd').css('backgroundColor','pink');
    $('li:even').css('backgroundColor','yellow');
})