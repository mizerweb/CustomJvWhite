package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hl7 extends kih {
    public final /* synthetic */ int c;
    public ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl7(fka fkaVar, int i) {
        super(fkaVar);
        this.c = i;
        switch (i) {
            case 1:
                super(fkaVar);
                if (this.d == null) {
                    this.d = new ArrayList();
                }
                break;
            default:
                break;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                if (str.equals("calls")) {
                    this.d = new ArrayList();
                    int iJ = ch3.J(fkaVar);
                    for (int i = 0; i < iJ; i++) {
                        this.d.add(sti.a(fkaVar));
                    }
                } else {
                    fkaVar.x();
                }
                break;
            default:
                if (!cqk.d(str, "members")) {
                    fkaVar.x();
                } else {
                    int iJ2 = ch3.J(fkaVar);
                    this.d = new ArrayList();
                    hj8 hj8VarF0 = oc9.f0(0, iJ2);
                    ArrayList arrayList = new ArrayList(yw3.W0(hj8VarF0, 10));
                    Iterator it = hj8VarF0.iterator();
                    while (true) {
                        gj8 gj8Var = (gj8) it;
                        if (!gj8Var.c) {
                            ArrayList arrayList2 = this.d;
                            if (arrayList2 == null) {
                                arrayList2 = null;
                            }
                            arrayList2.addAll(arrayList);
                        } else {
                            gj8Var.nextInt();
                            arrayList.add(o63.a(fkaVar));
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        switch (this.c) {
            case 0:
                return c0a.o("Response{calls=", String.valueOf(this.d), "}");
            default:
                ArrayList arrayList = this.d;
                if (arrayList == null) {
                    arrayList = null;
                }
                return c0a.o("{members : [", ww3.z1(arrayList, null, null, null, new u8h(23), 31), "]}");
        }
    }
}
