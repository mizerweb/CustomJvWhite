package defpackage;

import one.me.messages.list.loader.MessageModel;
import one.video.calls.sdk.net.signaling.WSSignaling;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class il1 implements af7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ il1(qw7 qw7Var, String str, boolean z) {
        this.c = qw7Var;
        this.d = str;
        this.b = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qw7 qw7Var = (qw7) this.c;
                String str = (String) this.d;
                boolean z = this.b;
                o65.c(pk1.b.b(), qt4.q(qt4.u(((ow7) qw7Var).a, ":call-user?opponent_id=", "&video_enabled=", z), "&microphone_enabled=true&conversation_id=", str.toString(), "&start_source=HISTORY"), null, null, 6);
                return sbi.a;
            case 1:
                jsa jsaVar = (jsa) this.c;
                boolean z2 = this.b;
                MessageModel messageModel = (MessageModel) this.d;
                Object objT1 = ww3.t1(jsaVar.i0().f.a.d());
                adi adiVar = objT1 instanceof adi ? (adi) objT1 : null;
                if (z2 && adiVar != null) {
                    if (adiVar.a != 0) {
                        String str2 = jsaVar.v;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str2, zo5.j(adiVar.a, "Try scroll to unread marker, mark: "), null);
                            }
                        }
                        long j = adiVar.a;
                        long j2 = messageModel != null ? messageModel.c : 0L;
                        fva fvaVarG0 = jsaVar.g0();
                        fvaVarG0.g(yab.h0(fvaVarG0.c, fvaVarG0.b, 2, new ag0(fvaVarG0, j, j2, null, 4)));
                    }
                }
                return sbi.a;
            default:
                return WSSignaling.sniProvider_delegate$lambda$0(this.b, (y3e) this.c, (WSSignaling) this.d);
        }
    }

    public /* synthetic */ il1(jsa jsaVar, boolean z, MessageModel messageModel) {
        this.c = jsaVar;
        this.b = z;
        this.d = messageModel;
    }

    public /* synthetic */ il1(boolean z, y3e y3eVar, WSSignaling wSSignaling) {
        this.b = z;
        this.c = y3eVar;
        this.d = wSSignaling;
    }
}
