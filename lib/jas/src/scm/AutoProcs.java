package scm;

import jas.*;
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddCPItem extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-addcpe expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addcpe expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-addcpe expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-addcpe expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addcpe expects a CP for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("jas-class-addcpe expects a CP for arg #2"); }
    CP arg1 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    arg0.addCPItem(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-addcpe#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddField extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-addfield expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addfield expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-addfield expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-addfield expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addfield expects a Var for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Var)) { throw new SchemeError("jas-class-addfield expects a Var for arg #2"); }
    Var arg1 = (tmp != null)?(Var)(((primnode)tmp).val):null;
    arg0.addField(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-addfield#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddInterface extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-addinterface expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addinterface expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-addinterface expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-addinterface expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addinterface expects a CP for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("jas-class-addinterface expects a CP for arg #2"); }
    CP arg1 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    arg0.addInterface(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-addinterface#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetClass extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-setclass expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-setclass expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-setclass expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-setclass expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-setclass expects a CP for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("jas-class-setclass expects a CP for arg #2"); }
    CP arg1 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    arg0.setClass(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-setclass#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetSuperClass extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-setsuperclass expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-setsuperclass expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-setsuperclass expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-setsuperclass expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-setsuperclass expects a CP for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("jas-class-setsuperclass expects a CP for arg #2"); }
    CP arg1 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    arg0.setSuperClass(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-setsuperclass#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddMethod extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-addmethod expects 6 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addmethod expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-addmethod expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-addmethod expects 6 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("jas-class-addmethod expects a number for arg #2"); }
    short arg1 = (short)(((Selfrep)tmp).num);
    if (t == null) { throw new SchemeError("jas-class-addmethod expects 6 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("jas-class-addmethod expects a String for arg #3"); }
    String arg2 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("jas-class-addmethod expects 6 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("jas-class-addmethod expects a String for arg #4"); }
    String arg3 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("jas-class-addmethod expects 6 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addmethod expects a CodeAttr for arg #5"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CodeAttr)) { throw new SchemeError("jas-class-addmethod expects a CodeAttr for arg #5"); }
    CodeAttr arg4 = (tmp != null)?(CodeAttr)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-addmethod expects 6 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-addmethod expects a ExceptAttr for arg #6"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ExceptAttr)) { throw new SchemeError("jas-class-addmethod expects a ExceptAttr for arg #6"); }
    ExceptAttr arg5 = (tmp != null)?(ExceptAttr)(((primnode)tmp).val):null;
    arg0.addMethod(arg1, arg2, arg3, arg4, arg5);
  return null;
  }
  public String toString()
  { return ("<#jas-class-addmethod#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetClassAccess extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-setaccess expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-setaccess expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-setaccess expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-setaccess expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("jas-class-setaccess expects a number for arg #2"); }
    short arg1 = (short)(((Selfrep)tmp).num);
    arg0.setClassAccess(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-setaccess#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetSource extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-setsource expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-setsource expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-setsource expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-setsource expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("jas-class-setsource expects a String for arg #2"); }
    String arg1 = (tmp!=null)?((Selfrep)tmp).val:null;
    arg0.setSource(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-setsource#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmwrite extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-class-write expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-write expects a ClassEnv for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ClassEnv)) { throw new SchemeError("jas-class-write expects a ClassEnv for arg #1"); }
    ClassEnv arg0 = (tmp != null)?(ClassEnv)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-class-write expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-class-write expects a scmOutputStream for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof scmOutputStream)) { throw new SchemeError("jas-class-write expects a scmOutputStream for arg #2"); }
    scmOutputStream arg1 = (tmp != null)?(scmOutputStream)(((primnode)tmp).val):null;
    arg0.write(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-class-write#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddException extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-exception-add expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-exception-add expects a ExceptAttr for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ExceptAttr)) { throw new SchemeError("jas-exception-add expects a ExceptAttr for arg #1"); }
    ExceptAttr arg0 = (tmp != null)?(ExceptAttr)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-exception-add expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-exception-add expects a CP for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("jas-exception-add expects a CP for arg #2"); }
    CP arg1 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    arg0.addException(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-exception-add#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddInsn extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-code-addinsn expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-code-addinsn expects a CodeAttr for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CodeAttr)) { throw new SchemeError("jas-code-addinsn expects a CodeAttr for arg #1"); }
    CodeAttr arg0 = (tmp != null)?(CodeAttr)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-code-addinsn expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-code-addinsn expects a Insn for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Insn)) { throw new SchemeError("jas-code-addinsn expects a Insn for arg #2"); }
    Insn arg1 = (tmp != null)?(Insn)(((primnode)tmp).val):null;
    arg0.addInsn(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-code-addinsn#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetStackSize extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-code-stack-size expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-code-stack-size expects a CodeAttr for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CodeAttr)) { throw new SchemeError("jas-code-stack-size expects a CodeAttr for arg #1"); }
    CodeAttr arg0 = (tmp != null)?(CodeAttr)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-code-stack-size expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("jas-code-stack-size expects a number for arg #2"); }
    short arg1 = (short)(((Selfrep)tmp).num);
    arg0.setStackSize(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-code-stack-size#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetVarSize extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-code-var-size expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-code-var-size expects a CodeAttr for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CodeAttr)) { throw new SchemeError("jas-code-var-size expects a CodeAttr for arg #1"); }
    CodeAttr arg0 = (tmp != null)?(CodeAttr)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-code-var-size expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("jas-code-var-size expects a number for arg #2"); }
    short arg1 = (short)(((Selfrep)tmp).num);
    arg0.setVarSize(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-code-var-size#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmsetCatchtable extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-set-catchtable expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-set-catchtable expects a CodeAttr for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CodeAttr)) { throw new SchemeError("jas-set-catchtable expects a CodeAttr for arg #1"); }
    CodeAttr arg0 = (tmp != null)?(CodeAttr)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-set-catchtable expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-set-catchtable expects a Catchtable for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Catchtable)) { throw new SchemeError("jas-set-catchtable expects a Catchtable for arg #2"); }
    Catchtable arg1 = (tmp != null)?(Catchtable)(((primnode)tmp).val):null;
    arg0.setCatchtable(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-set-catchtable#>"); }
}
//Autogenerated by procinfo on Tue Apr 17 15:43:24 EDT 2001
class scmaddEntry extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {

    Cell t = args;
    Obj tmp;
    if (t == null) { throw new SchemeError("jas-add-catch-entry expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-add-catch-entry expects a Catchtable for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Catchtable)) { throw new SchemeError("jas-add-catch-entry expects a Catchtable for arg #1"); }
    Catchtable arg0 = (tmp != null)?(Catchtable)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("jas-add-catch-entry expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("jas-add-catch-entry expects a CatchEntry for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CatchEntry)) { throw new SchemeError("jas-add-catch-entry expects a CatchEntry for arg #2"); }
    CatchEntry arg1 = (tmp != null)?(CatchEntry)(((primnode)tmp).val):null;
    arg0.addEntry(arg1);
  return null;
  }
  public String toString()
  { return ("<#jas-add-catch-entry#>"); }
}
