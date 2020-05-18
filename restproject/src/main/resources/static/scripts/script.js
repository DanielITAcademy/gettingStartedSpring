$ (function(){
    var $name=$('#insertedText');//instancio el input type text con el nombre name
    var $insert=$('#demo1');
    var $introduce=$('#demo');
    $.ajax({
        type: 'GET',
        url: '/helloworldprueba',
        success: function(item){
          console.log('success',item);
        $insert.append(item.content);   //append para insertar
        },
        error: function(){
            alert('error loading');

        }

    });

    $('#addtext').on('click',function(){
        var item = { // greetings=item
            name: $name.val(),// creamos objeto item con una variable nombre en la que obtenemos el valor de la caja

        };
    $.ajax({
        type: 'POST',
        url: '/helloworldprueba',
       /* contentType: "application/json",
        data: JSON.stringify(item),*/
        data: item,
        success: function(newItem){
            $introduce.append(newItem.content)
        },
        error: function(){
            alert('error saving name');
        }

    })
    })
});