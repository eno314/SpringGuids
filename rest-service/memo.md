# Building a RESTful Web Service の作業メモ

下記チュートリアルの作業ログ
https://spring.io/guides/gs/rest-service/

## Intellij で環境構築

1. `SPRING INITIALIZR`（ https://start.spring.io/ ）を使ってプロジェクトを作成
   * Generate a `Gradle Project` with `Kotlin` and Spring Boot `1.5.7` で設定
   * Groupにはパッケージ名を入力
   * Artifactにはプロジェクト名を入力
   * DependenciesはWebだけ選択
1. Generate Projectボタンを押してダウンロードして解凍する
1. Intellijで `Import Project`を選択
1. 解凍したファイル内の`build.gradle`を選んで`open`
1. `Use auto-import`にチェックを入れて、`OK`

https://github.com/eno314/SpringGuids/commit/6804a6ce5fe85abf60af23a40f09ff19285d5ea1


## Create a resource representation class

* SpringはJackson JSONライブラリを使用している

https://github.com/eno314/SpringGuids/commit/dab8347b4cdfed6514fcb104d1d8519d9ae7b3ad

## Create a resource controller

* `@RequestMapping(method=GET)`のようにしてmethodを絞りこめる
* オブジェクトデータをJSONとしてHTTPレスポンスに直接書き込まれている
* `@RestController`アノテーションは`@Controller`と`@ResponseBody`をまとめてロールしたもの。
* Jackson2が自動でGreetingインスタンスをJSONに変換してくれている

https://github.com/eno314/SpringGuids/commit/5a594d82b1fcbb94631c7122ea75b8cd8b09981d

## Make the application executable

`SPRING INITIALIZR`が作成してくれている

## Build

Intellijからアプリケーションを実行すると、   http://localhost:8080/greeting
にアクセスすれば動作確認ができる
