
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package parser;

import java_cup.runtime.*;
import ast.interfaces.*;
import designPatterns.*;
import ast.impl.*;
import java.util.Stack;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\004\000\002\003" +
    "\005\000\002\003\005\000\002\003\004\000\002\003\003" +
    "\000\002\005\005\000\002\005\005\000\002\005\003\000" +
    "\002\004\003\000\002\004\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\010\005\010\012\012\016\007\001\002\000" +
    "\004\002\027\001\002\000\012\004\ufffc\005\ufffc\011\ufffc" +
    "\013\ufffc\001\002\000\016\004\ufff9\005\ufff9\006\023\007" +
    "\024\011\ufff9\013\ufff9\001\002\000\016\004\ufff8\005\ufff8" +
    "\006\ufff8\007\ufff8\011\ufff8\013\ufff8\001\002\000\006\012" +
    "\012\016\007\001\002\000\010\004\014\005\016\011\021" +
    "\001\002\000\010\005\010\012\012\016\007\001\002\000" +
    "\010\004\014\005\016\013\015\001\002\000\006\012\012" +
    "\016\007\001\002\000\016\004\ufff7\005\ufff7\006\ufff7\007" +
    "\ufff7\011\ufff7\013\ufff7\001\002\000\006\012\012\016\007" +
    "\001\002\000\012\004\ufffe\005\ufffe\011\ufffe\013\ufffe\001" +
    "\002\000\012\004\uffff\005\uffff\011\uffff\013\uffff\001\002" +
    "\000\004\002\001\001\002\000\012\004\ufffd\005\ufffd\011" +
    "\ufffd\013\ufffd\001\002\000\006\012\012\016\007\001\002" +
    "\000\006\012\012\016\007\001\002\000\012\004\ufffa\005" +
    "\ufffa\011\ufffa\013\ufffa\001\002\000\012\004\ufffb\005\ufffb" +
    "\011\ufffb\013\ufffb\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\012\002\003\003\010\004\005\005\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\005\005\021\001\001\000" +
    "\002\001\001\000\010\003\012\004\005\005\004\001\001" +
    "\000\002\001\001\000\006\004\005\005\017\001\001\000" +
    "\002\001\001\000\006\004\005\005\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\004\005\005\025\001\001\000\006\004\005" +
    "\005\024\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    IFactory fabrica;
    Stack<IExpression> pilha = new Stack<IExpression>();

    public Parser(Scanner scanner, IFactory fac){
        this(scanner);
        this.fabrica = fac;
    }    

    public void efetuaOperacaoBinaria(int code){
        IExpression e2 = this.pilha.pop();
        IExpression e1 = this.pilha.pop();
        IOperation op = this.fabrica.createBinaryOperation(code,e1,e2);
        this.pilha.push(op);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_ptv ::= expr PTVIRG 
            {
              IExpression RESULT =null;
		                    
                    IExpression resultado = parser.pilha.pop();                   
                    RESULT = resultado;
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_ptv",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_ptv EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		IExpression start_val = (IExpression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr MAIS term 
            {
              IExpression RESULT =null;
		
                    parser.efetuaOperacaoBinaria(sym.MAIS);                   
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr MENOS term 
            {
              IExpression RESULT =null;
		
                    parser.efetuaOperacaoBinaria(sym.MENOS);                   
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= MENOS term 
            {
              IExpression RESULT =null;
		
                    IExpression e = parser.pilha.pop();
                    IOperation op = parser.fabrica.createUnaryOperation(sym.MENOS, e);
                    parser.pilha.push(op);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= term 
            {
              IExpression RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // term ::= factor MULT term 
            {
              IExpression RESULT =null;
		
                    parser.efetuaOperacaoBinaria(sym.MULT);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // term ::= factor DIV term 
            {
              IExpression RESULT =null;
		
                    parser.efetuaOperacaoBinaria(sym.DIV);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // term ::= factor 
            {
              IExpression RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("term",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // factor ::= NUMBER 
            {
              IExpression RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                    parser.pilha.push(parser.fabrica.createNumber(n));
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // factor ::= ABREPAR expr FECHAPAR 
            {
              IExpression RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
