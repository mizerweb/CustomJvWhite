package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class w2d implements Parcelable {
    public static final Parcelable.Creator<w2d> CREATOR = new p8c(22);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;
    public PlaybackState.CustomAction e;

    public w2d(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.a = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.b = charSequence;
        this.c = parcel.readInt();
        this.d = parcel.readBundle(v2a.class.getClassLoader());
    }

    public static w2d a(PlaybackState.CustomAction customAction) {
        w2d w2dVar = new w2d(customAction.getAction(), customAction.getName(), customAction.getIcon(), vqi.n(customAction.getExtras()));
        w2dVar.e = customAction;
        return w2dVar;
    }

    public final PlaybackState.CustomAction b() {
        PlaybackState.CustomAction customAction = this.e;
        if (customAction != null) {
            return customAction;
        }
        PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.a, this.b, this.c);
        builder.setExtras(this.d);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }

    public w2d(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = bundle;
    }
}
