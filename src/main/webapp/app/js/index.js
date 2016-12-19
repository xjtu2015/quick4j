$(function() {
    App.init();

    var Index = (function() {
        var me = {};

        // 处理一级菜单点击
        me.handleMenuClick = function() {
            $('#page-sidebar-menu > li').click(function(e) {
                e.preventDefault();
                var menu = $('#page-sidebar-menu');
                var li = menu.find('li.active').removeClass('active');

                // 添加选中 打开的样式
                /*$(this).addClass('active');*/
                var Cdata= $.trim($(e.target).text());
                var Pdata= $.trim($('#page-title-pare').text());


                if(Cdata == '首页'){  $('#page-title-pare').text(''); $('#page-title-chil').text('');}
               else if( Pdata == null||Pdata == '') {
                   $('#page-title-pare').text(Cdata);
               }

                else if(Pdata=='知识建模'&&((Cdata=='概念域建模')||(Cdata=='功能域建模')||(Cdata=='生成元数据')||(Cdata=='问题域建模'))){

                    $('#page-title-chil').text(Cdata);
                }

                else if(Pdata=='系统管理'&&((Cdata=='用户管理')||(Cdata=='角色管理')||(Cdata=='权限管理'))){

                    $('#page-title-chil').text(Cdata);
                }


            });
        };

       // 处理子菜单点击
        me.handleSubMenuClick = function() {
            $('#page-sidebar-menu li a').click(function(e) {
                e.preventDefault();
                var url = this.href;
                if (url != null && url != 'javascript:;') {
                   /* $.get(url, function(data) {
                        $('#main-content').html(data);
                    });*/
                    $('#iframe').attr('src',url);
                }
            });
        };
        me.handlePageTtlieClick=function(){
            $('#page-title-men li a').click(function(e) {
                e.preventDefault();
                var url = this.href;
                if (url != null && url != 'javascript:;') {
                    /* $.get(url, function(data) {
                     $('#main-content').html(data);
                     });*/
                    $('#iframe').attr('src',url);
                }
            });

        };

        me.init = function() {
            me.handleMenuClick();
            me.handleSubMenuClick();
            me.handlePageTtlieClick();

        };

        return me;
    })();

    Index.init();

    /*$('#btn-dashboard').trigger("click");*/

});


//画图操作
jsPlumb.ready(function() {

    // ... your code goes here ...


});