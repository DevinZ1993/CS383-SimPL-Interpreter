all: Parser.java Symbols.java Lexer.java

CUP=../../../lib/java-cup-11a.jar
JFLEX=../../../lib/JFlex.jar

Parser.java: simpl.grm
	java -jar ${CUP} -parser Parser -symbols Symbols -interface < simpl.grm

Symbols.java: simpl.grm
	java -jar ${CUP} -parser Parser -symbols Symbols -interface < simpl.grm

Lexer.java: simpl.lex
	java -cp ${JFLEX} JFlex.Main simpl.lex

clean:
	rm -f Parser.java Symbols.java Lexer.java
