package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.mlkit.common.MlKitException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public class wb9 {
    private MappedByteBuffer a;
    private final Context b;
    private final vb9 c;

    public wb9(Context context, vb9 vb9Var) {
        this.b = context;
        this.c = vb9Var;
    }

    public vb9 a() {
        return this.c;
    }

    public MappedByteBuffer b() throws MlKitException {
        yab.t(this.b, "Context can not be null");
        yab.t(this.c, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.a;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        vb9 vb9Var = this.c;
        String strA = vb9Var.a();
        String strB = vb9Var.b();
        Uri uriC = vb9Var.c();
        if (strA != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(strA, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        this.a = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        channel.close();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        if (channel == null) {
                            throw th;
                        }
                        try {
                            channel.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                        throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.c.a())), 14, e);
                    }
                } catch (Throwable th3) {
                    try {
                        randomAccessFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException e) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.c.a())), 14, e);
            }
        } else if (strB != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.b.getAssets().openFd(strB);
                try {
                    FileChannel channel2 = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel();
                    try {
                        this.a = channel2.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                        channel2.close();
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th5) {
                        if (channel2 == null) {
                            throw th5;
                        }
                        try {
                            channel2.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                        throw new MlKitException(c0a.o("Can not load the file from asset: ", strB, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e);
                    }
                } catch (Throwable th7) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th7;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            } catch (IOException e2) {
                throw new MlKitException(c0a.o("Can not load the file from asset: ", strB, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e2);
            }
        } else {
            if (uriC == null) {
                throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
            }
            try {
                AssetFileDescriptor assetFileDescriptorA = lfl.a(this.b, uriC);
                try {
                    FileChannel channel3 = assetFileDescriptorA.createInputStream().getChannel();
                    try {
                        this.a = channel3.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorA.getStartOffset(), assetFileDescriptorA.getLength());
                        channel3.close();
                        assetFileDescriptorA.close();
                    } catch (Throwable th9) {
                        if (channel3 == null) {
                            throw th9;
                        }
                        try {
                            channel3.close();
                            throw th9;
                        } catch (Throwable th10) {
                            th9.addSuppressed(th10);
                            throw th9;
                        }
                        throw new MlKitException("Can not load the file from URI: ".concat(uriC.toString()), 14, e);
                    }
                } catch (Throwable th11) {
                    if (assetFileDescriptorA == null) {
                        throw th11;
                    }
                    try {
                        assetFileDescriptorA.close();
                        throw th11;
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                        throw th11;
                    }
                }
            } catch (IOException e3) {
                throw new MlKitException("Can not load the file from URI: ".concat(uriC.toString()), 14, e3);
            }
        }
        return this.a;
    }
}
