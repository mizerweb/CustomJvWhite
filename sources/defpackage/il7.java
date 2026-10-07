package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class il7 extends kih {
    public final /* synthetic */ int c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il7(fka fkaVar, int i) {
        super(fkaVar);
        this.c = i;
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        ArrayList arrayList;
        switch (this.c) {
            case 0:
                str.getClass();
                if (str.equals("mentions")) {
                    this.d = hm4.a(fkaVar);
                } else {
                    fkaVar.x();
                }
                break;
            default:
                str.getClass();
                if (str.equals("locations")) {
                    LinkedHashMap linkedHashMap = null;
                    if (fkaVar.y().a() == 8) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int iP0 = fkaVar.P0();
                        for (int i = 0; i < iP0; i++) {
                            Long lValueOf = Long.valueOf(ch3.T(fkaVar, 0L));
                            if (fkaVar.y().a() == 7) {
                                arrayList = new ArrayList();
                                int iT0 = fkaVar.t0();
                                for (int i2 = 0; i2 < iT0; i2++) {
                                    arrayList.add(wc9.a(fkaVar));
                                }
                            } else {
                                fkaVar.x();
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                linkedHashMap2.put(lValueOf, arrayList);
                            }
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        fkaVar.x();
                    }
                    this.d = linkedHashMap;
                } else {
                    fkaVar.x();
                }
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        switch (this.c) {
            case 0:
                return c0a.k(tre.O((hm4) this.d), "Response{mentions=", "}");
            default:
                return c0a.o("Response{locations=", String.valueOf((LinkedHashMap) this.d), "}");
        }
    }
}
