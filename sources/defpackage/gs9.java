package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gs9 extends Handler {
    public final WeakReference a;
    public WeakReference b;

    public gs9(is9 is9Var) {
        this.a = new WeakReference(is9Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.b;
        if (weakReference == null) {
            return;
        }
        Messenger messenger = (Messenger) weakReference.get();
        is9 is9Var = (is9) this.a.get();
        if (messenger == null || is9Var == null) {
            return;
        }
        Bundle data = message.getData();
        if (data != null) {
            ClassLoader classLoader = v2a.class.getClassLoader();
            classLoader.getClass();
            data.setClassLoader(classLoader);
        }
        try {
            if (message.what != 3) {
                lvb.G0("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            vqi.n(data.getBundle("data_options"));
            vqi.n(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            tab.i(data.getParcelableArrayList("data_media_item_list"), js9.CREATOR);
            if (is9Var.g != messenger) {
                return;
            }
            if (string != null && is9Var.e.get(string) != null) {
                throw new ClassCastException();
            }
            lvb.g0("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
        } catch (BadParcelableException unused) {
            lvb.k0("MediaBrowserCompat", "Could not unparcel the data.");
        }
    }
}
