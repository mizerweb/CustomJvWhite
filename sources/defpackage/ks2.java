package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class ks2 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ ns2 c;

    public /* synthetic */ ks2(yx6 yx6Var, ns2 ns2Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = ns2Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
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
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        js2 js2Var;
        int i;
        ms2 ms2Var;
        switch (this.a) {
            case 0:
                Object obj2 = r66.a;
                if (lq4Var instanceof js2) {
                    js2Var = (js2) lq4Var;
                    int i2 = js2Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        js2Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        js2Var = new js2(this, lq4Var);
                    }
                } else {
                    js2Var = new js2(this, lq4Var);
                }
                Object obj3 = js2Var.d;
                hu4 hu4Var = hu4.a;
                int i3 = js2Var.e;
                if (i3 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var = this.b;
                    ylc ylcVar = (ylc) obj;
                    long jLongValue = ((Number) ylcVar.a).longValue();
                    long jLongValue2 = ((Number) ylcVar.b).longValue();
                    ns2 ns2Var = this.c;
                    if (jLongValue2 < jLongValue) {
                        String str = ns2Var.g;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.c;
                            if (a4cVar.b(je9Var)) {
                                StringBuilder sbS = qt4.s(jLongValue2, "consumed ", " < ");
                                sbS.append(jLongValue);
                                a4cVar.c(je9Var, str, sbS.toString(), null);
                            }
                        }
                        i = 1;
                    } else {
                        if (jLongValue2 >= jLongValue) {
                            int iD = ns2Var.b.d(jLongValue);
                            int iD2 = ns2Var.b.d(jLongValue2);
                            if (iD < 0 || iD2 < 0) {
                                String str2 = ns2Var.g;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.f;
                                    if (a4cVar2.b(je9Var2)) {
                                        StringBuilder sbS2 = qt4.s(jLongValue, "not found pos. first:", " last:");
                                        c0a.w(sbS2, jLongValue2, " firstId:", iD);
                                        a4cVar2.c(je9Var2, str2, zo5.v(sbS2, " lastId:", iD2), null);
                                    }
                                }
                            } else {
                                hj8 hj8Var = new hj8(iD, iD2, 1);
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hj8Var.iterator();
                                while (true) {
                                    gj8 gj8Var = (gj8) it;
                                    if (gj8Var.c) {
                                        MessageModel messageModelQ = ns2Var.b.Q(gj8Var.nextInt());
                                        Long lValueOf = messageModelQ != null ? Long.valueOf(messageModelQ.b) : null;
                                        if (lValueOf == null || lValueOf.longValue() == 0) {
                                            messageModelQ = null;
                                        }
                                        if (messageModelQ != null) {
                                            arrayList.add(messageModelQ);
                                        }
                                    } else {
                                        obj2 = arrayList;
                                    }
                                }
                            }
                        }
                        i = 1;
                    }
                    js2Var.e = i;
                    if (yx6Var.emit(obj2, js2Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            default:
                ns2 ns2Var2 = this.c;
                l8b l8bVar = ns2Var2.f;
                if (lq4Var instanceof ms2) {
                    ms2Var = (ms2) lq4Var;
                    int i4 = ms2Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ms2Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        ms2Var = new ms2(this, lq4Var);
                    }
                } else {
                    ms2Var = new ms2(this, lq4Var);
                }
                Object obj4 = ms2Var.d;
                hu4 hu4Var2 = hu4.a;
                int i5 = ms2Var.e;
                if (i5 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var2 = this.b;
                    for (MessageModel messageModel : (List) obj) {
                        l8bVar.l(messageModel.b, messageModel);
                        ns2Var2.e.a(messageModel.b);
                    }
                    ms2Var.e = 1;
                    if (yx6Var2.emit(l8bVar, ms2Var) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
        }
    }
}
