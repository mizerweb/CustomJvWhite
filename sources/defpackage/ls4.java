package defpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.ConversationFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ls4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ls4(String str, File file, xva xvaVar) {
        this.a = 2;
        this.c = str;
        this.b = file;
        this.d = xvaVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:97:0x0223  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        char c;
        InputStream inputStream;
        FileInputStream fileInputStream;
        OutputStream outputStream;
        int i;
        Closeable[] closeableArr;
        int i2;
        Closeable closeable;
        int i3;
        Closeable[] closeableArr2;
        int i4;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        char c2;
        Object wiiVar;
        int i5 = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i5) {
            case 0:
                return ((ConversationFactory) obj2).lambda$hangup$11((String) obj3, (it7) obj);
            case 1:
                return ((bh5) obj2).a.submit(new gf5((Callable) obj3, 3, (rj5) obj));
            default:
                File file = (File) obj2;
                y3e y3eVar = (y3e) ((xva) obj).b;
                String strJ = zo5.j(System.currentTimeMillis(), "Boundary-");
                HttpURLConnection httpURLConnection2 = null;
                String strI = null;
                OutputStream outputStream2 = null;
                OutputStream outputStream3 = null;
                httpURLConnection2 = null;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL((String) obj3).openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection3.setDoOutput(true);
                    httpURLConnection3.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnection3.setRequestProperty(HTTP.CONTENT_TYPE, "multipart/form-data; boundary=".concat(strJ));
                    httpURLConnection3.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
                    try {
                        fileInputStream = new FileInputStream(file);
                        char c3 = 1;
                        try {
                            outputStream = httpURLConnection3.getOutputStream();
                            try {
                                outputStream.getClass();
                                Charset charset = pt2.a;
                                httpURLConnection = httpURLConnection3;
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
                                    bufferedWriter.write("--" + strJ + "\r\n");
                                    bufferedWriter.write("Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"\r\n");
                                    bufferedWriter.write("Content-Type: application/octet-stream\r\n");
                                    bufferedWriter.write("\r\n");
                                    bufferedWriter.flush();
                                    try {
                                        iu6.h(fileInputStream, outputStream);
                                        bufferedWriter.write("\r\n");
                                        bufferedWriter.write("--" + strJ + "--\r\n");
                                        bufferedWriter.flush();
                                        int responseCode = httpURLConnection.getResponseCode();
                                        boolean z = 200 <= responseCode && responseCode < 300;
                                        inputStream = z ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                                        if (inputStream != null) {
                                            try {
                                                strI = gm0.I(new BufferedReader(new InputStreamReader(inputStream, charset), 8192));
                                            } catch (Exception e) {
                                                e = e;
                                                outputStream2 = outputStream;
                                                outputStream = outputStream2;
                                                c2 = c3;
                                                httpURLConnection2 = httpURLConnection;
                                                c = c2;
                                                try {
                                                    y3eVar.log("FormDataFileUploader", "Uploading failed with " + e);
                                                    wii wiiVar2 = new wii(e.getMessage());
                                                    closeableArr2 = new Closeable[3];
                                                    closeableArr2[0] = fileInputStream;
                                                    closeableArr2[c == true ? 1 : 0] = outputStream;
                                                    closeableArr2[2] = inputStream;
                                                    i4 = 0;
                                                    for (i3 = 3; i4 < i3; i3 = 3) {
                                                        closeable2 = closeableArr2[i4];
                                                        if (closeable2 != null) {
                                                            try {
                                                                closeable2.close();
                                                            } catch (IOException unused) {
                                                            }
                                                        }
                                                        i4++;
                                                    }
                                                    if (httpURLConnection2 != null) {
                                                        httpURLConnection2.disconnect();
                                                    }
                                                    return wiiVar2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    closeableArr = new Closeable[3];
                                                    closeableArr[0] = fileInputStream;
                                                    closeableArr[c] = outputStream;
                                                    closeableArr[2] = inputStream;
                                                    i2 = 0;
                                                    for (i = 3; i2 < i; i = 3) {
                                                        closeable = closeableArr[i2];
                                                        if (closeable != null) {
                                                            try {
                                                                closeable.close();
                                                            } catch (IOException unused2) {
                                                            }
                                                        }
                                                        i2++;
                                                    }
                                                    if (httpURLConnection2 != null) {
                                                        throw th;
                                                    }
                                                    httpURLConnection2.disconnect();
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                outputStream3 = outputStream;
                                                outputStream = outputStream3;
                                                c = c3;
                                                httpURLConnection2 = httpURLConnection;
                                                closeableArr = new Closeable[3];
                                                closeableArr[0] = fileInputStream;
                                                closeableArr[c] = outputStream;
                                                closeableArr[2] = inputStream;
                                                i2 = 0;
                                                while (i2 < i) {
                                                    closeable = closeableArr[i2];
                                                    if (closeable != null) {
                                                        closeable.close();
                                                    }
                                                    i2++;
                                                }
                                                if (httpURLConnection2 != null) {
                                                    throw th;
                                                }
                                                httpURLConnection2.disconnect();
                                                throw th;
                                            }
                                        }
                                        String str = strI;
                                        if (z) {
                                            y3eVar.log("FormDataFileUploader", "Uploading was successful. Code: " + responseCode + ", message " + str);
                                            wiiVar = xii.a;
                                        } else {
                                            y3eVar.log("FormDataFileUploader", "Uploading failed. Code: " + responseCode + ", message " + str);
                                            wiiVar = new wii("Code: " + responseCode + ", message " + str);
                                        }
                                        Closeable[] closeableArr3 = {fileInputStream, outputStream, inputStream};
                                        int i6 = 0;
                                        for (int i7 = 3; i6 < i7; i7 = 3) {
                                            Closeable closeable3 = closeableArr3[i6];
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                            i6++;
                                        }
                                        httpURLConnection.disconnect();
                                        return wiiVar;
                                    } catch (Exception e2) {
                                        e = e2;
                                        inputStream = null;
                                        c2 = c3;
                                        httpURLConnection2 = httpURLConnection;
                                        c = c2;
                                        y3eVar.log("FormDataFileUploader", "Uploading failed with " + e);
                                        wii wiiVar3 = new wii(e.getMessage());
                                        closeableArr2 = new Closeable[3];
                                        closeableArr2[0] = fileInputStream;
                                        closeableArr2[c == true ? 1 : 0] = outputStream;
                                        closeableArr2[2] = inputStream;
                                        i4 = 0;
                                        while (i4 < i3) {
                                            closeable2 = closeableArr2[i4];
                                            if (closeable2 != null) {
                                                closeable2.close();
                                            }
                                            i4++;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        return wiiVar3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = null;
                                        c = c3;
                                        httpURLConnection2 = httpURLConnection;
                                        closeableArr = new Closeable[3];
                                        closeableArr[0] = fileInputStream;
                                        closeableArr[c] = outputStream;
                                        closeableArr[2] = inputStream;
                                        i2 = 0;
                                        while (i2 < i) {
                                            closeable = closeableArr[i2];
                                            if (closeable != null) {
                                                closeable.close();
                                            }
                                            i2++;
                                        }
                                        if (httpURLConnection2 != null) {
                                            throw th;
                                        }
                                        httpURLConnection2.disconnect();
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    inputStream = null;
                                    outputStream2 = outputStream;
                                    outputStream = outputStream2;
                                    c2 = c3;
                                    httpURLConnection2 = httpURLConnection;
                                    c = c2;
                                    y3eVar.log("FormDataFileUploader", "Uploading failed with " + e);
                                    wii wiiVar4 = new wii(e.getMessage());
                                    closeableArr2 = new Closeable[3];
                                    closeableArr2[0] = fileInputStream;
                                    closeableArr2[c == true ? 1 : 0] = outputStream;
                                    closeableArr2[2] = inputStream;
                                    i4 = 0;
                                    while (i4 < i3) {
                                        closeable2 = closeableArr2[i4];
                                        if (closeable2 != null) {
                                            closeable2.close();
                                        }
                                        i4++;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    return wiiVar4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream = null;
                                    outputStream3 = outputStream;
                                    outputStream = outputStream3;
                                    c = c3;
                                    httpURLConnection2 = httpURLConnection;
                                    closeableArr = new Closeable[3];
                                    closeableArr[0] = fileInputStream;
                                    closeableArr[c] = outputStream;
                                    closeableArr[2] = inputStream;
                                    i2 = 0;
                                    while (i2 < i) {
                                        closeable = closeableArr[i2];
                                        if (closeable != null) {
                                            closeable.close();
                                        }
                                        i2++;
                                    }
                                    if (httpURLConnection2 != null) {
                                        throw th;
                                    }
                                    httpURLConnection2.disconnect();
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                httpURLConnection = httpURLConnection3;
                            } catch (Throwable th5) {
                                th = th5;
                                httpURLConnection = httpURLConnection3;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            httpURLConnection = httpURLConnection3;
                            inputStream = null;
                        } catch (Throwable th6) {
                            th = th6;
                            httpURLConnection = httpURLConnection3;
                            inputStream = null;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        httpURLConnection = httpURLConnection3;
                        c2 = 1;
                        inputStream = null;
                        fileInputStream = null;
                        outputStream = null;
                    } catch (Throwable th7) {
                        th = th7;
                        httpURLConnection = httpURLConnection3;
                        c = 1;
                        inputStream = null;
                        fileInputStream = null;
                        outputStream = null;
                    }
                } catch (Exception e7) {
                    e = e7;
                    c = 1;
                    inputStream = null;
                    fileInputStream = null;
                    outputStream = null;
                } catch (Throwable th8) {
                    th = th8;
                    c = 1;
                    inputStream = null;
                    fileInputStream = null;
                    outputStream = null;
                }
                break;
        }
    }

    public /* synthetic */ ls4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
