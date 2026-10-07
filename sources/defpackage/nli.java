package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nli extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ uli f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nli(uli uliVar, ArrayList arrayList, int i, int i2, int i3, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = uliVar;
        this.g = arrayList;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new nli(this.f, this.g, this.h, this.i, this.j, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((nli) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        uli uliVar;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControlImpl#issueSingleCaptureAsync");
            }
            i64 i64Var = uli.l;
            ArrayList arrayList = this.g;
            Iterator it = arrayList.iterator();
            loop0: while (true) {
                boolean zHasNext = it.hasNext();
                uliVar = this.f;
                if (!zHasNext) {
                    break;
                }
                hl2 hl2Var = (hl2) it.next();
                if (!Collections.unmodifiableList(hl2Var.a).isEmpty()) {
                    Iterator it2 = Collections.unmodifiableList(hl2Var.a).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((Map) uliVar.c.f.getValue()).get((wf5) it2.next()) == null) {
                            }
                        }
                    }
                }
                uli.n(arrayList.size(), "Capture request failed due to invalid surface");
                break loop0;
            }
            mli mliVarO = uli.o(uliVar.k);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControl: Submitting still captures to capture pipeline");
            }
            pl2 pl2Var = (pl2) uliVar.h.getValue();
            int i2 = mliVarO.d.a;
            jc2 jc2VarR = mliVarO.a.r();
            this.e = 1;
            obj = pl2Var.c(arrayList, i2, jc2VarR, this.h, this.i, this.j, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return (List) obj;
    }
}
