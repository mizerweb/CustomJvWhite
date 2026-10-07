package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* JADX INFO: loaded from: classes.dex */
public final class ac1 implements zb1 {
    public final ifh a;
    public final ny8 b;
    public final ny8 c;
    public final ifh d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final c51 j;

    public ac1(ny8 ny8Var, ifh ifhVar, ny8 ny8Var2, ny8 ny8Var3, ifh ifhVar2, ny8 ny8Var4, ny8 ny8Var5, y82 y82Var) {
        this.a = ifhVar;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ifhVar2;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var;
        MicrophoneManager microphoneManagerB = b();
        boolean z = false;
        if (microphoneManagerB != null && microphoneManagerB.isMicEnabled()) {
            z = true;
        }
        this.j = new c51(Boolean.valueOf(z), new g3(5, this), y82Var);
    }

    public final a80 a() {
        rb0 rb0Var = (rb0) this.h.get();
        return rb0Var != null ? rb0Var.getCurrentDevice() : a80.d;
    }

    public final MicrophoneManager b() {
        Conversation conversationA = ((f9) this.g.getValue()).a();
        if (conversationA != null) {
            return conversationA.getMicrophoneManager();
        }
        return null;
    }

    public final boolean c() {
        return ((Boolean) this.j.c.getValue()).booleanValue();
    }

    public final void d(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAudioController", zo5.s("CallAudioController microphone changed=", z), null);
            }
        }
        this.j.g.c(new a51(Boolean.valueOf(z)));
        if (!z || ((Boolean) ((e5d) this.f.getValue()).y().i()).booleanValue()) {
            return;
        }
        ((ue1) this.b.getValue()).r(((x02) ((b95) this.e.getValue()).i.a.getValue()).s());
    }
}
