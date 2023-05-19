import java_cup.runtime.Symbol;

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
inteiro = {digito}+

fimdeLinha = \r|\n|\r\n
espaco = {fimdeLinha} | [ \t\f]
opMais = "+"
opMult = "*"
opDiv = "/"
opMod = "%"

%%

{inteiro} { 
	double aux = Double.parseDouble (yytext());
	return new Symbol (sym.INTEIRO, new Double(aux)); 
}

/**
 * O do atributo sym.<nome> que usaremos aqui
 * é o nome que demos la no arquivo .cup 
 */	
{opMais} { return new Symbol(sym.MAIS);	}
{opMult} { return new Symbol(sym.MULT);	}
{opDiv} { return new Symbol(sym.DIV);	}
{opMod} { return new Symbol(sym.MOD);	}

"-" { return new Symbol(sym.MENOS);}

";" { return new Symbol(sym.PTVIRG);}

{espaco} { /* despreza */ }

.|\n { /* Caractere inválido */ 		
	return new Symbol(sym.EOF, yyline, yycolumn, yytext());		
	}