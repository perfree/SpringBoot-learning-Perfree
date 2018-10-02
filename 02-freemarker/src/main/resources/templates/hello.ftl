<!DOCTYPE html>
<html lang="en">
<body>
    Hello ${name}
    <div>
        <h3>list</h3>
        <#list names as myName>
          ${myName}
        </#list>
    </div>
</body>
</html>