package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nth implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ guh b;
    public final /* synthetic */ jrc c;

    public /* synthetic */ nth(guh guhVar, jrc jrcVar, int i) {
        this.a = i;
        this.b = guhVar;
        this.c = jrcVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        jrc jrcVar = this.c;
        guh guhVar = this.b;
        switch (i) {
            case 0:
                return guhVar.a.wrap((ByteBuffer[]) jrcVar.d, 0, jrcVar.b, guhVar.m.e());
            default:
                return guhVar.a.unwrap(guhVar.l.e(), (ByteBuffer[]) jrcVar.d, 0, jrcVar.b);
        }
    }
}
