package defpackage;

import java.util.Set;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes2.dex */
public interface rb0 {
    void a(CallsAudioManager.State state);

    void b(a80 a80Var);

    void c(l82 l82Var);

    void d(boolean z);

    Set getAvailableAudioDevices();

    a80 getCurrentDevice();

    void release();
}
