1)If you fill in the fields and click the saveUser button, you will save the User to the database
2)If you click on the Get button, you will receive all User who are older than 20 years
3)If you fill in the fields and click on the saveArticle button, you save the Article and the person to whom it belongs
4)If you click the FindUserByArticle button, you will receive all Users in which there are more than 3 Article
5)If you click the FindByColor button, you will receive all Users in which Article has a green color
POSTMAN:
1)if you type url (http://localhost:8080/getUsersArticle) using the Get method, you get the next result:
[
    "asd",
    "qwe"
]
2)if you type url (http://localhost:8080/getAll) using the Get method, you get the next result:
[
    {
        "id": 1,
        "name": "qwe",
        "age": 25
    },
    {
        "id": 2,
        "name": "qwe",
        "age": 85
    },
    {
        "id": 3,
        "name": "qwe",
        "age": 25
    },
    {
        "id": 4,
        "name": "asd",
        "age": 85
    },
    {
        "id": 6,
        "name": "as",
        "age": 85
    }
]
3)if you type url (http://localhost:8080/getUserByColor) using the Get method, you get the next result:
[
    {
        "id": 2,
        "name": "qwe",
        "age": 85
    }
]
4)
if you type url(http://localhost:8080/saveUser) by POST and enter data in the Body({
                                               "id": 5,
                                              "name": "qwe",
                                              "age": 25
                                              })
field you will get the next result
