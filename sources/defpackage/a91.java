package defpackage;

import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a91 implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;
    public final /* synthetic */ yt1 c;

    public /* synthetic */ a91(o91 o91Var, yt1 yt1Var, int i) {
        this.a = i;
        this.b = o91Var;
        this.c = yt1Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        yt1 yt1Var = this.c;
        o91 o91Var = this.b;
        switch (i) {
            case 0:
                skg skgVar = o91Var.d0;
                ru1 ru1Var = o91Var.j0;
                ru1Var.getClass();
                skgVar.a((du1) ww3.t1(ru1Var.o(null, Collections.singletonList(yt1Var))));
                break;
            default:
                if (yt1Var.equals(o91Var.C0)) {
                    o91Var.C0 = null;
                    o91Var.n(oh1.y, null);
                }
                break;
        }
    }
}
