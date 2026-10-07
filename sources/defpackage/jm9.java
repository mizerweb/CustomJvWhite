package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class jm9 extends z3 {
    public static final Parcelable.Creator<jm9> CREATOR = new pkk(29);
    public final String a;

    public jm9(String str) {
        yab.t(str, "json must not be null");
        this.a = str;
    }

    public static jm9 b(Context context, int i) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i2 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        n2m.a(inputStreamOpenRawResource);
                        n2m.a(byteArrayOutputStream);
                        return new jm9(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    n2m.a(inputStreamOpenRawResource);
                    n2m.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException(zo5.i(i, "Failed to read resource ", ": ", e.toString()));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 2, this.a);
        jol.u(iT, parcel);
    }
}
