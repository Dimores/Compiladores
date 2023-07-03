
package scanner;
import java_cup.runtime.Symbol;
import parser.sym;

%%

%class Scanner
%unicode
%cup
%line
%column
%public

%{
	public Scanner(java.io.InputStream in) {
		this(new java.io.InputStreamReader(in, java.nio.charset.Charset.forName("UTF-8")));
	}
%}

digito = [0-9]
letra = [a-zA-Z]
digitos = [0-9]+
ident = {letra}({letra}|{digito})*

fimdeLinha = \r|\n|\r\n
espaco = {fimdeLinha} | [ \t\f]

%%

{digitos} { 
	int aux = Integer.parseInt(yytext());
	return new Symbol(sym.NUMBER, new Integer(aux)); 
}

{ident} { return new Symbol(sym.IDENT, yytext());}

"+" { return new Symbol(sym.MAIS);	}
"-" { return new Symbol(sym.MENOS);}
"/" { return new Symbol(sym.DIV);}
"*" { return new Symbol(sym.MULT);}
"%" { return new Symbol(sym.MOD);}
";" { return new Symbol(sym.PTVIRG);}
"(" { return new Symbol(sym.ABREPAR);}
")" { return new Symbol(sym.FECHAPAR);}

{espaco} { /* despreza */ }

.|\n { /* Caractere inválido */ 		
	return new Symbol(sym.EOF, yyline, yycolumn, yytext());		
     }