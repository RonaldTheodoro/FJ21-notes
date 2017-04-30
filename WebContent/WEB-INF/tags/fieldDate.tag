<%@attribute name="id" required="true" %>

<input id="${id}" name="${id}" type="text">

<script>
    $("#datepicker").datepicker({dateFormat: 'dd/mm/yy'});
</script>