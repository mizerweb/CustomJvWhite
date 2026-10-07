package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e82 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallsAudioManagerV2Impl b;
    public final /* synthetic */ af7 c;
    public final /* synthetic */ af7 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cf7 f;

    public /* synthetic */ e82(CallsAudioManagerV2Impl callsAudioManagerV2Impl, af7 af7Var, af7 af7Var2, String str, cf7 cf7Var, int i) {
        this.a = i;
        this.b = callsAudioManagerV2Impl;
        this.c = af7Var;
        this.d = af7Var2;
        this.e = str;
        this.f = cf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cf7 cf7Var = this.f;
        String str = this.e;
        af7 af7Var = this.d;
        af7 af7Var2 = this.c;
        CallsAudioManagerV2Impl callsAudioManagerV2Impl = this.b;
        switch (i) {
            case 0:
                CallsAudioManagerV2Impl.doOnOwnThreadWithDelay$lambda$9(callsAudioManagerV2Impl, af7Var2, af7Var, str, cf7Var);
                break;
            default:
                CallsAudioManagerV2Impl.doOnOwnThread$lambda$8(callsAudioManagerV2Impl, af7Var2, af7Var, str, cf7Var);
                break;
        }
    }
}
