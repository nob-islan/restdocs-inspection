# Restdoc inspection

## サンプルリクエスト

```shell
#get
curl -X GET -H 'Content-Type: application/json' localhost:8080/sample/get?name=nob
```

```shell
# post
curl -X POST -H 'Content-Type: application/json' -d '{"userId": "nob", "password": "p@ssw0rd"}' localhost:8080/sample/post
```

## 参考文献

- [公式ドキュメント](https://spring.pleiades.io/guides/gs/testing-restdocs)
