package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u80 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final p70 d;
    public final boolean e;
    public final AudioFocusRequest f;

    public u80(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, p70 p70Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = p70Var;
        this.e = z;
        this.b = onAudioFocusChangeListener;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(p70Var.c()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final t80 a() {
        t80 t80Var = new t80();
        t80Var.a = this.a;
        t80Var.c = this.b;
        t80Var.d = this.c;
        t80Var.e = this.d;
        t80Var.b = this.e;
        return t80Var;
    }

    public final AudioFocusRequest b() {
        AudioFocusRequest audioFocusRequest = this.f;
        audioFocusRequest.getClass();
        return audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return this.a == u80Var.a && this.e == u80Var.e && Objects.equals(this.b, u80Var.b) && Objects.equals(this.c, u80Var.c) && Objects.equals(this.d, u80Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
