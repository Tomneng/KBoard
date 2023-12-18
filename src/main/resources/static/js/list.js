$(function (){
    $("[name='pageRows']").change(function (){
        let frm = $("[name='frmPageRows']");
        frm.attr("method", "Post")
        frm.attr("action", "pageRows")
        frm.submit();
    })
    // 검증코드 등...
})
