package defpackage;

import java.io.IOException;
import java.nio.channels.Pipe;

/* JADX INFO: loaded from: classes3.dex */
public final class nr6 {
    public final ze9 a;
    public final Pipe b = Pipe.open();

    public nr6(ze9 ze9Var) {
        this.a = ze9Var;
    }

    public final void a() {
        ze9 ze9Var = this.a;
        Pipe pipe = this.b;
        try {
            pipe.sink().close();
        } catch (IOException e) {
            ze9Var.r("FileInfoUpdateSender", new s35(26), new mp5(7, e));
        }
        try {
            pipe.source().close();
        } catch (IOException e2) {
            ze9Var.r("FileInfoUpdateSender", new s35(27), new mp5(7, e2));
        }
    }
}
