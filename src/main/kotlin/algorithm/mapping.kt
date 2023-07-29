package algorithm

import java.util.*

// FROM NETWORK
data class ArticleApiModel(
    val id: Long,
    val title: String,
    val content: String,
    val publicationDate: Date,
    // val modifications: Array<ArticleApiModel>,
    //val comments: Array<CommentApiModel>,
    val lastModificationDate: Date,
    val authorId: Long,
    val authorName: String,
    val authorDateOfBirth: Date,
    val readTimeMin: Int
)

data class Article(
    val id: Long,
    val title: String,
    val content: String,
    val publicationDate: Date,
    val authorName: String,
    val readTimeMin: Int
)

fun ArticleApiModel.toLocal() = Article(
    id = id,
    title = title,
    content = content,
    publicationDate = publicationDate,
    authorName = authorName,
    readTimeMin = readTimeMin
)

fun List<ArticleApiModel>.toLocal() = map(ArticleApiModel::toLocal)

fun List<ArticleApiModel>.toLocal2(): List<Article> {
    return  map {
        Article(
            id = it.id,
            title = it.title,
            content = it.content,
            publicationDate = it.publicationDate,
            authorName = it.authorName,
            readTimeMin = it.readTimeMin
        )
    }}
