        var menu_flag = true;
        $("#menu").click(function(){
          if (menu_flag) {
              $("#container").animate({"bottom": "-=200px"}, "slow");
            menu_flag = false;
          }else{
            $("#container").animate({"bottom": "+=200px"}, "slow");
                menu_flag = true;
          }
        });