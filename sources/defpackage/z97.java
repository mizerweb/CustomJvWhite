package defpackage;

import java.util.Iterator;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z97 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga7 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ aec d;

    public /* synthetic */ z97(ga7 ga7Var, aec aecVar, float f, int i) {
        this.a = i;
        this.b = ga7Var;
        this.d = aecVar;
        this.c = f;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        float f = this.c;
        aec aecVar = this.d;
        ga7 ga7Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).r(aecVar, f);
                }
                break;
            default:
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) aecVar;
                Iterator it2 = ga7Var.b.iterator();
                while (it2.hasNext()) {
                    ((xdc) it2.next()).c(baseVideoPlayer, f);
                }
                break;
        }
        return sbiVar;
    }
}
