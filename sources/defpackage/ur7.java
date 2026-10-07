package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ur7 implements wrh {
    public static final byte[] f = {0, 0, 1};
    public int a;
    public int b;
    public int c;
    public boolean d;
    public Serializable e;

    public ur7(String str, int i, boolean z) {
        int i2 = i * np0.n;
        this.a = i2;
        this.b = i2;
        this.c = i;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.wrh
    public trh a(int i, int i2, int i3) {
        int i4 = this.c;
        boolean z = this.d;
        String str = (String) this.e;
        ifh ifhVar = xrh.a;
        StringBuilder sb = new StringBuilder("https://tiles.api-maps.yandex.ru/v1/tiles/?lang=ru_RU&l=map&projection=web_mercator&maptype=future_map&");
        if (i4 != 1) {
            sb.append("scale=");
            sb.append(i4);
            sb.append('&');
        }
        if (!z) {
            sb.append("theme=dark&");
        }
        zo5.C(i, i2, "x=", "&y=", sb);
        sb.append("&z=");
        sb.append(i3);
        sb.append("&apikey=");
        sb.append(str);
        try {
            URL url = new URL(sb.toString());
            try {
                int i5 = this.a;
                int i6 = this.b;
                InputStream inputStream = url.openConnection().getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yab.t(inputStream, "from must not be null.");
                byte[] bArr = new byte[np0.r];
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        return new trh(i5, byteArrayOutputStream.toByteArray(), i6);
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
            } catch (IOException unused) {
                return null;
            }
        } catch (MalformedURLException e) {
            c.e(e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    public void b(int i, byte[] bArr, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.b + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.e, this.b, i3);
            this.b += i3;
        }
    }
}
