package com.DSA.Java9_11_17.Java17;

public class TextBlocks {

    public static void main(String[] args) {



    /*Before Java 15, writing multi-line strings was painful.

Suppose you want to write an SQL query.

Before Java 15
String sql = "SELECT id, name\n" +
             "FROM employee\n" +
             "WHERE salary > 50000";

Problems:

Lots of +
Lots of \n
Hard to read
Doesn't look like actual SQL
What problem does it solve?

It lets you write multi-line strings exactly as they appear.

Syntax

A Text Block starts and ends with three double quotes.

String text = """
Hello
Welcome
Java 17
""";

Output:

Hello
Welcome
Java 17

No +

No \n

No escaping every new line.

SQL Example

Instead of

String sql =
        "SELECT * FROM employee\n" +
        "WHERE department='IT'\n" +
        "ORDER BY salary DESC";

Use

String sql = """
        SELECT *
        FROM employee
        WHERE department = 'IT'
        ORDER BY salary DESC
        """;

This looks exactly like SQL.

Very common in Spring Boot.

JSON Example

Old way

String json =
"{\"id\":1,\"name\":\"Ravi\"}";

Difficult to read because of escaping.

With Text Blocks

String json = """
{
    "id": 1,
    "name": "Ravi"
}
""";

Much cleaner.*/

    String sql = """
        SELECT *
        FROM employee
        WHERE department = 'IT'
        ORDER BY salary DESC
        """;

    System.out.println(sql);

        String json =
                "{\"id\":1,\"name\":\"Ravi\"}";
        System.out.println(json);

        String json2 = """
{
    "id": 1,
    "name": "Ravi"
}
""";
        System.out.println(json2);
}}
/*Benefits
1. More readable

Instead of:

"a\nb\nc"

You simply write:

"""
a
b
c
"""
2. Less escaping

Especially useful for JSON and HTML.

3. Easier maintenance

Editing a SQL query or JSON document becomes much easier.

4. Looks like the original content

Developers can copy and paste SQL or JSON directly into the code.

Real-world Spring Boot Usage
Native SQL
String sql = """
        SELECT *
        FROM employee
        WHERE department = ?
        """;
JSON Response
String response = """
{
    "status": "SUCCESS",
    "message": "User Created"
}
""";
HTML Email Template
String email = """
<html>
    <body>
        <h2>Welcome Ravi</h2>
    </body>
</html>
""";
Interview Questions
Q1. Why were Text Blocks introduced?

Answer:

To make multi-line strings easier to write and read, reducing the need for string concatenation and escaped newline characters.

Q2. When would you use Text Blocks?

Answer:

For SQL queries, JSON, XML, HTML, email templates, and any multi-line text.

Q3. Do Text Blocks preserve indentation?

Answer:

Java removes the common leading indentation automatically, making the source code readable without adding unwanted spaces to the string.

Q4. Can escape sequences still be used?

Answer:

Yes. Escape sequences such as \n, \t, \", and \\ are still supported inside Text Blocks.

Comparison
Old Style
String sql =
    "SELECT *\n" +
    "FROM employee";
Text Block
String sql = """
SELECT *
FROM employee
""";

The second version is much easier to read.*/