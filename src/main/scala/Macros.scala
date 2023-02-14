import scala.concurrent.Future
import scala.quoted.*

inline def printPositions(): Unit =
  ${ printPositionsImpl() }

private def printPositionsImpl()(using Quotes): Expr[Unit] = {
  import quotes.reflect.*
  val sym = TypeRepr.of[TestClass].typeSymbol

  println(s"${sym.pos.get.start} start")
  println(s"${sym.pos.get.startColumn} startColumn")
  println(s"${sym.pos.get.startLine} startLine")

  println(s"${sym.pos.get.end} end")
  println(s"${sym.pos.get.endColumn} endColumn")
  println(s"${sym.pos.get.endLine} endLine")

  println(s"${sym.pos.get.sourceFile} sourceFile")
  println(s"${sym.pos.get.sourceCode} sourceCode")
  '{}
}