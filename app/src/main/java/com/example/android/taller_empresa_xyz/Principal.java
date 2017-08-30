package com.example.android.taller_empresa_xyz;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private TextView res;
    private TextView res1;
    private EditText Cmanillas;
    private Spinner Material;
    private Spinner Tipo;
    private Spinner Dije;
    private Spinner Moneda;
    private Resources resources;
    private String op[];
    private String op2[];
    private String op3[];
    private String op4[];
    private ArrayAdapter<String> adapter1, adapter2, adapter3, adapter4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        res = (TextView)findViewById(R.id.lblRes);
        res1= (TextView)findViewById(R.id.lblRes1);
        Cmanillas = (EditText)findViewById(R.id.txtCantidad);
        Material = (Spinner)findViewById(R.id.cmbMaterial);
        Tipo = (Spinner)findViewById(R.id.cmbTipo);
        Dije = (Spinner)findViewById(R.id.cmbDije);
        Moneda = (Spinner)findViewById(R.id.cmbMoneda);
        resources = this.getResources();
        op = resources.getStringArray(R.array.material);
        op2 = resources.getStringArray(R.array.dije);
        op3 = resources.getStringArray(R.array.tipo);
        op4 = resources.getStringArray(R.array.moneda);
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op2);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op3);
        adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op4);

        Material.setAdapter(adapter1);
        Tipo.setAdapter(adapter2);
        Dije.setAdapter(adapter3);
        Moneda.setAdapter(adapter4);

    }


    public boolean Validar() {
        if (Cmanillas.getText().toString().isEmpty()) {
            Cmanillas.setError(resources.getString(R.string.error1));
            return false;
        }
        return true;
    }


    public void   Calcular(View v) {
        int pre = 0, posicion;

        if (Validar()) {
            posicion = Moneda.getSelectedItemPosition();

            int cant = Integer.parseInt(Cmanillas.getText().toString());
            if (posicion == 0) {
                if (Material.getSelectedItemPosition() == 0) {
                    if (Dije.getSelectedItemPosition() == 0) {
                        if (Tipo.getSelectedItemPosition() == 0) {
                            pre = cant * 3200 * 100;
                        } else {
                            if (Tipo.getSelectedItemPosition() == 1) {
                                pre = cant * 3200 * 100;
                            } else {
                                if (Tipo.getSelectedItemPosition() == 2) {
                                    pre = cant * 3200 * 80;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 3) {
                                        pre = cant * 3200 * 70;
                                    }
                                }
                            }
                        }

                    } else {
                        if (Dije.getSelectedItemPosition() == 1) {
                            if (Tipo.getSelectedItemPosition() == 0) {
                                pre = cant * 3200 * 120;
                            } else {
                                if (Tipo.getSelectedItemPosition() == 1) {
                                    pre = cant * 3200 * 120;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 2) {
                                        pre = cant * 3200 * 100;
                                    } else {
                                        if (Tipo.getSelectedItemPosition() == 3) {
                                            pre = cant * 3200 * 90;
                                        }
                                    }
                                }
                            }
                        }
                    }

                } else {
                    if (Material.getSelectedItemPosition() == 1) {
                        if (Dije.getSelectedItemPosition() == 0) {
                            if (Tipo.getSelectedItemPosition() == 0) {
                                pre = cant * 3200 * 90;
                            } else {
                                if (Tipo.getSelectedItemPosition() == 1) {
                                    pre = cant * 3200 * 90;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 2) {
                                        pre = cant * 3200 * 70;
                                    } else {
                                        if (Tipo.getSelectedItemPosition() == 3) {
                                            pre = cant * 3200 * 50;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (Dije.getSelectedItemPosition() == 1) {
                                if (Tipo.getSelectedItemPosition() == 0) {
                                    pre = cant * 3200 * 110;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 1) {
                                        pre = cant * 3200 * 110;
                                    } else {
                                        if (Tipo.getSelectedItemPosition() == 2) {
                                            pre = cant * 3200 * 90;
                                        } else {
                                            if (Tipo.getSelectedItemPosition() == 3) {
                                                pre = cant * 3200 * 80;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (posicion == 1) {
                    if (Material.getSelectedItemPosition() == 0) {
                        if (Dije.getSelectedItemPosition() == 0) {
                            if (Tipo.getSelectedItemPosition() == 0) {
                                pre = cant * 100;
                            } else {
                                if (Tipo.getSelectedItemPosition() == 1) {
                                    pre = cant * 100;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 2) {
                                        pre = cant * 80;
                                    }
                                    if (Tipo.getSelectedItemPosition() == 3) {
                                        pre = cant * 70;
                                    }
                                }
                            }
                        } else {
                            if (Dije.getSelectedItemPosition() == 1) {
                                if (Tipo.getSelectedItemPosition() == 0) {
                                    pre = cant * 120;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 1) {
                                        pre = cant * 120;
                                    } else {
                                        if (Tipo.getSelectedItemPosition() == 2) {
                                            pre = cant * 100;
                                        } else {
                                            if (Tipo.getSelectedItemPosition() == 3) {
                                                pre = cant * 90;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (Material.getSelectedItemPosition() == 1) {
                            if (Dije.getSelectedItemPosition() == 0) {
                                if (Tipo.getSelectedItemPosition() == 0) {
                                    pre = cant * 90;
                                } else {
                                    if (Tipo.getSelectedItemPosition() == 1) {
                                        pre = cant * 90;
                                    } else {
                                        if (Tipo.getSelectedItemPosition() == 2) {
                                            pre = cant * 70;
                                        } else {
                                            if (Tipo.getSelectedItemPosition() == 3) {
                                                pre = cant * 50;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (Dije.getSelectedItemPosition() == 1) {
                                    if (Tipo.getSelectedItemPosition() == 0) {
                                        pre = cant * 110;
                                    } else {
                                        if (Tipo.getSelectedItemPosition() == 1) {
                                            pre = cant * 110;
                                        } else {
                                            if (Tipo.getSelectedItemPosition() == 2) {
                                                pre = cant * 90;
                                            } else {
                                                if (Tipo.getSelectedItemPosition() == 3) {
                                                    pre = cant * 80;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            res.setText("$ " + (pre));
            res1.setText("Gracias por su Compra " );

        }
    }


    public void Borrar(View v){
        res.setText("");
        res1.setText("");
        Cmanillas.setText("");
        Cmanillas.requestFocus();
        Material.setSelection(0);
         Tipo.setSelection(0);
         Dije.setSelection(0);
         Moneda.setSelection(0);

    }




}
