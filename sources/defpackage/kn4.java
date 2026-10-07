package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kn4 implements o9 {
    @Override // defpackage.o9
    public final void a(hve hveVar) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        try {
            nrk.b(hveVar).startActivityForResult(intent, 102);
        } catch (ActivityNotFoundException unused) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, "ContactsDeepLinkFactory", "createContact: failed, no activity found", null, null, 8);
            }
        }
    }
}
