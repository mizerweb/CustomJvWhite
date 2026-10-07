package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t2a implements Parcelable {
    public static final Parcelable.Creator<t2a> CREATOR = new v39(21);
    public final uv9 a;
    public final long b;
    public MediaSession.QueueItem c;

    public t2a(MediaSession.QueueItem queueItem, uv9 uv9Var, long j) {
        if (j == -1) {
            ore.p("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = uv9Var;
        this.b = j;
        this.c = queueItem;
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new t2a(queueItem, uv9.a(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    public final uv9 b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final MediaSession.QueueItem d() {
        MediaSession.QueueItem queueItem = this.c;
        if (queueItem != null) {
            return queueItem;
        }
        MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(this.a.f(), this.b);
        this.c = queueItem2;
        return queueItem2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return c0a.m(this.b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public t2a(uv9 uv9Var, long j) {
        this(null, uv9Var, j);
    }

    public t2a(Parcel parcel) {
        this.a = uv9.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
