package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class k03 extends aq implements qih, btc {
    public final long f;
    public final long g;

    public k03(long j, long j2, long j3) {
        super(j);
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        qw2 qw2VarP = p();
        kx2 kx2Var = kx2.b;
        long j = this.f;
        qw2VarP.w(j, kx2Var);
        o().c(new l03(this.a, j));
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        String str = yhhVar.b;
        if (p90.C(str)) {
            return;
        }
        if (cqk.d(str, "chat.not.found")) {
            o().c(new l03(this.a, this.f));
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChannelLeave channelLeave = new Tasks.ChannelLeave();
        channelLeave.requestId = this.a;
        channelLeave.chatId = this.f;
        channelLeave.chatServerId = this.g;
        return sia.toByteArray(channelLeave);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_LEAVE;
    }

    @Override // defpackage.btc
    public final atc j() {
        return p().N(this.f) != null ? atc.a : atc.c;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        return new wy2(this.g);
    }
}
