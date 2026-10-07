package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class npk {
    public static final void a(ed6 ed6Var, Exception exc) {
        ((t1c) ed6Var).a(new h37(exc.getMessage(), exc));
    }

    public static final ey9 b(MessageModel messageModel, long j, t50 t50Var, String str) {
        return new ey9(messageModel.a, j, t50Var, str);
    }

    public static final List c(MessageModel messageModel) {
        Object py9Var;
        Object ky9Var;
        qy9 py9Var2;
        boolean z = messageModel.l;
        t50 t50Var = messageModel.j.b;
        if ((t50Var instanceof iq9) || (t50Var instanceof aq6)) {
            if (t50Var instanceof yv3) {
                ArrayList<yu3> arrayList = ((yv3) t50Var).b;
                ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                for (yu3 yu3Var : arrayList) {
                    if (!(yu3Var instanceof g58)) {
                        if (!(yu3Var instanceof fti)) {
                            ore.o();
                            return null;
                        }
                        if (z) {
                            fti ftiVar = (fti) yu3Var;
                            long j = ftiVar.a;
                            String str = ftiVar.h;
                            if (str == null) {
                                str = "";
                            }
                            py9Var2 = b(messageModel, j, t50Var, str);
                        } else {
                            fti ftiVar2 = (fti) yu3Var;
                            py9Var2 = new py9(messageModel.a, ftiVar2.a, t50Var, ftiVar2);
                        }
                    } else if (z) {
                        g58 g58Var = (g58) yu3Var;
                        long j2 = g58Var.a;
                        String str2 = g58Var.k;
                        if (str2 == null) {
                            str2 = "";
                        }
                        py9Var2 = b(messageModel, j2, t50Var, str2);
                    } else {
                        g58 g58Var2 = (g58) yu3Var;
                        py9Var2 = new ky9(messageModel.a, g58Var2.a, t50Var, g58Var2, null, 48);
                    }
                    arrayList2.add(py9Var2);
                }
                return arrayList2;
            }
            if (t50Var instanceof h8g) {
                if (z) {
                    g58 g58Var3 = ((h8g) t50Var).c;
                    long j3 = g58Var3.a;
                    String str3 = g58Var3.k;
                    ky9Var = b(messageModel, j3, t50Var, str3 != null ? str3 : "");
                } else {
                    long j4 = messageModel.a;
                    g58 g58Var4 = ((h8g) t50Var).c;
                    ky9Var = new ky9(j4, g58Var4.a, t50Var, g58Var4, null, 48);
                }
                return Collections.singletonList(ky9Var);
            }
            if (t50Var instanceof eag) {
                if (z) {
                    fti ftiVar3 = ((eag) t50Var).c;
                    long j5 = ftiVar3.a;
                    String str4 = ftiVar3.h;
                    py9Var = b(messageModel, j5, t50Var, str4 != null ? str4 : "");
                } else {
                    long j6 = messageModel.a;
                    fti ftiVar4 = ((eag) t50Var).c;
                    py9Var = new py9(j6, ftiVar4.a, t50Var, ftiVar4);
                }
                return Collections.singletonList(py9Var);
            }
            if (t50Var instanceof aq6) {
                ArrayList arrayList3 = new ArrayList();
                aq6 aq6Var = (aq6) t50Var;
                String str5 = aq6Var.c;
                g58 g58Var5 = aq6Var.j;
                fti ftiVar5 = aq6Var.k;
                if (z && g58Var5 != null) {
                    arrayList3.add(b(messageModel, g58Var5.a, t50Var, str5));
                    return arrayList3;
                }
                if (z && ftiVar5 != null) {
                    arrayList3.add(b(messageModel, ftiVar5.a, t50Var, str5));
                    return arrayList3;
                }
                if (g58Var5 != null) {
                    arrayList3.add(new ky9(messageModel.a, g58Var5.a, t50Var, g58Var5, str5, 16));
                    return arrayList3;
                }
                if (ftiVar5 != null) {
                    arrayList3.add(new py9(messageModel.a, ftiVar5.a, t50Var, ftiVar5, str5));
                }
                return arrayList3;
            }
        }
        return r66.a;
    }
}
