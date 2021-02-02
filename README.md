# ResponseEntity
😜 Usando Spring ResponseEntity para manipular a resposta HTTP

Usando o Spring, geralmente temos muitas maneiras de atingir o mesmo objetivo, incluindo o ajuste fino de respostas HTTP.

ResponseEntity representa toda a resposta HTTP: código de status, cabeçalhos e corpo. Como resultado, podemos usá-lo para configurar totalmente a resposta HTTP.

Se quisermos usá-lo, temos que devolvê-lo do ponto de extremidade; O Spring cuida do resto.

### ResponseEntity é um tipo genérico. Consequentemente, podemos usar qualquer tipo como corpo de resposta

```
public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("Hello Isac na raiz", HttpStatus.OK);
    }
```    

### Spring também nos permite acessar o objeto javax.servlet.http.HttpServletResponse diretamente; só temos que declará-lo como um argumento do método

```
void manual(HttpServletResponse response) throws IOException {
        response.setHeader("Custom-Header", "foo");
        response.setStatus(200);
        response.getWriter().println("Hello Isac! no EndPoint => manual");

    }
```
