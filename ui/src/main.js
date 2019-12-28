// main.js 是项目js的入口

// 1. 导入jquery
import $ from 'jquery'

$(function() {
    $('li:odd').css('backgroundColor','pink');
    $('li:even').css('backgroundColor','yellow');
})