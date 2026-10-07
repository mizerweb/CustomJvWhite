package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes2.dex */
public final class m46 implements sb5 {
    public final /* synthetic */ i19 a;

    public m46(EmojiCompatInitializer emojiCompatInitializer, i19 i19Var) {
        this.a = i19Var;
    }

    @Override // defpackage.sb5
    public final void onResume(g19 g19Var) {
        (Build.VERSION.SDK_INT >= 28 ? h94.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new qn5(1), 500L);
        this.a.f(this);
    }
}
