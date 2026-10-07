package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class at6 extends s1 {
    public final /* synthetic */ int c = 0;
    public final ArrayDeque d;
    public final /* synthetic */ ohf e;

    public at6(q4i q4iVar) {
        this.e = q4iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        cf7 cf7Var = q4iVar.b;
        Object obj = q4iVar.a;
        if (cf7Var.invoke(obj) == null) {
            arrayDeque.push(new n4i(this, obj));
            return;
        }
        arrayDeque.push(c(obj));
        if (q4iVar.c == 3) {
            arrayDeque.push(new n4i(this, obj));
        }
    }

    @Override // defpackage.s1
    public final void a() {
        int i = this.c;
        Object obj = null;
        ArrayDeque arrayDeque = this.d;
        switch (i) {
            case 0:
                break;
            default:
                q4i q4iVar = (q4i) this.e;
                while (true) {
                    p4i p4iVar = (p4i) arrayDeque.peek();
                    if (p4iVar != null) {
                        Object objA = p4iVar.a();
                        if (objA == null) {
                            arrayDeque.pop();
                        } else {
                            int i2 = q4iVar.c;
                            Object obj2 = p4iVar.a;
                            if (i2 == 3) {
                                if (objA != obj2 && arrayDeque.size() < Integer.MAX_VALUE) {
                                    arrayDeque.add(c(objA));
                                }
                            } else if (objA != obj2 && q4iVar.b.invoke(objA) != null && arrayDeque.size() < Integer.MAX_VALUE) {
                                arrayDeque.push(c(objA));
                            }
                            obj = objA;
                        }
                    }
                }
                if (obj == null) {
                    this.a = 2;
                    return;
                } else {
                    this.b = obj;
                    this.a = 1;
                    return;
                }
        }
        while (true) {
            bt6 bt6Var = (bt6) arrayDeque.peek();
            if (bt6Var != null) {
                File fileA = bt6Var.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else if (fileA.equals(bt6Var.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    obj = fileA;
                } else {
                    arrayDeque.push(b(fileA));
                }
            }
        }
        if (obj == null) {
            this.a = 2;
        } else {
            this.b = obj;
            this.a = 1;
        }
    }

    public ws6 b(File file) {
        int iD = qt4.D(((ct6) this.e).b);
        if (iD == 0) {
            return new zs6(this, file);
        }
        if (iD == 1) {
            return new xs6(this, file);
        }
        ore.o();
        return null;
    }

    public k4i c(Object obj) {
        int iD = qt4.D(((q4i) this.e).c);
        if (iD == 0) {
            return new o4i(this, obj);
        }
        if (iD == 1) {
            return new l4i(this, obj);
        }
        if (iD == 2) {
            return new m4i(this, obj);
        }
        ore.o();
        return null;
    }

    public at6(ct6 ct6Var) {
        this.e = ct6Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        File file = ct6Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new ys6(file));
        } else {
            this.a = 2;
        }
    }
}
