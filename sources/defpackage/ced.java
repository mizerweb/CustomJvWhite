package defpackage;

import androidx.datastore.preferences.protobuf.d;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ced extends d {
    private static final ced DEFAULT_INSTANCE;
    private static volatile omc PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private vj8 strings_ = qwd.d;

    static {
        ced cedVar = new ced();
        DEFAULT_INSTANCE = cedVar;
        d.h(ced.class, cedVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void i(ced cedVar, Set set) {
        vj8 vj8Var = cedVar.strings_;
        if (!((r3) vj8Var).a) {
            int size = vj8Var.size();
            cedVar.strings_ = vj8Var.k(size == 0 ? 10 : size * 2);
        }
        List list = cedVar.strings_;
        Charset charset = wj8.a;
        if (!(set instanceof zy8)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    ore.n(str);
                    return;
                }
                list.add(obj);
            }
            return;
        }
        List listE = ((zy8) set).e();
        zy8 zy8Var = (zy8) list;
        int size4 = list.size();
        for (Object obj2 : listE) {
            if (obj2 == null) {
                String str2 = "Element at index " + (zy8Var.size() - size4) + " is null.";
                for (int size5 = zy8Var.size() - 1; size5 >= size4; size5--) {
                    zy8Var.remove(size5);
                }
                ore.n(str2);
                return;
            }
            if (obj2 instanceof c71) {
                zy8Var.h((c71) obj2);
            } else {
                zy8Var.add((String) obj2);
            }
        }
    }

    public static ced j() {
        return DEFAULT_INSTANCE;
    }

    public static bed l() {
        return (bed) ((mj7) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.d
    public final Object d(int i) {
        omc nj7Var;
        switch (qt4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new i5e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new ced();
            case 4:
                return new bed(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                omc omcVar = PARSER;
                if (omcVar != null) {
                    return omcVar;
                }
                synchronized (ced.class) {
                    try {
                        nj7Var = PARSER;
                        if (nj7Var == null) {
                            nj7Var = new nj7();
                            PARSER = nj7Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return nj7Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final vj8 k() {
        return this.strings_;
    }
}
