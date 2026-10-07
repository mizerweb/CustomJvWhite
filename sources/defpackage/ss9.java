package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ss9 implements rs9 {
    public final Messenger a;

    public ss9(Messenger messenger) {
        this.a = messenger;
    }

    public final void a(String str, List list, Bundle bundle) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", tab.i(list, MediaBrowserCompat.MediaItem.CREATOR));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle2);
        this.a.send(messageObtain);
    }
}
