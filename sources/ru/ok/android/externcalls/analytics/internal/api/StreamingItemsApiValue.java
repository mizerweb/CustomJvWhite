package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.mv8;
import defpackage.np0;
import defpackage.u21;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public class StreamingItemsApiValue extends u21 {
    private final File file;
    private final boolean isCompressed;

    public StreamingItemsApiValue(File file, boolean z) {
        this.file = file;
        this.isCompressed = z;
    }

    @Override // defpackage.u21
    public void write(mv8 mv8Var) throws JsonSerializeException, IOException {
        mv8Var.r();
        try {
            InputStream fileInputStream = new FileInputStream(this.file);
            try {
                if (this.isCompressed) {
                    fileInputStream = new GZIPInputStream(fileInputStream, np0.r);
                }
                try {
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                        try {
                            mv8Var.T(inputStreamReader);
                            inputStreamReader.close();
                            fileInputStream.close();
                            mv8Var.q();
                        } catch (Throwable th) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (JsonSyntaxException e) {
                    throw new JsonSerializeException(e);
                }
            } catch (ZipException e2) {
                throw new JsonSerializeException(e2);
            }
        } catch (Throwable th5) {
            mv8Var.q();
            throw th5;
        }
    }
}
