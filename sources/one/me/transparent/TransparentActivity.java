package one.me.transparent;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ar;
import defpackage.e9i;
import defpackage.ifh;
import defpackage.x3i;
import defpackage.yvg;

/* JADX INFO: loaded from: classes2.dex */
public final class TransparentActivity extends ar {
    public static final /* synthetic */ int z = 0;
    public final ifh y = new ifh(new yvg(23));

    @Override // androidx.fragment.app.b, defpackage.g74, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e9i.B0(getIntent());
        super.onCreate(bundle);
        if (((x3i) this.y.getValue()).g(this, getIntent())) {
            finish();
        }
    }

    @Override // defpackage.g74, android.app.Activity
    public final void onNewIntent(Intent intent) {
        e9i.B0(intent);
        super.onNewIntent(intent);
        if (((x3i) this.y.getValue()).g(this, intent)) {
            finish();
        }
    }
}
