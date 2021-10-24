/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC Mateo
 */
public class Arreglos {
    public String arreglo_enfermedades(int n){
        Arreglos alim = new Arreglos();
        
        int numEnfermedades = 4;
        String[] arr_enfermedades = new String[numEnfermedades];
        
        //Nombres Alimentos
        //Grasas
        int aceiteOliva = 0, aguacate = 1, chia = 2, nuez = 3;
        //Carbohidratos
        int avena = 4, brocoli = 5, berenjena = 6, champiñon = 7, espinaca = 8, patata = 9;
        //Proteinas
        int pescado = 10, huevo = 11, lentejas = 12;
        //Especias
        int canela = 13, curcuma = 14;
        
        //Nombres Enfermedades
        int azucarAlto = 0, colestAlto = 1, anemia = 2, problDigestivos = 3; 
        
        arr_enfermedades[azucarAlto] = alim.arreglo_alimentos(avena) + alim.arreglo_alimentos(berenjena) + alim.arreglo_alimentos(patata);
        arr_enfermedades[colestAlto] = alim.arreglo_alimentos(chia) + alim.arreglo_alimentos(avena) + alim.arreglo_alimentos(berenjena) + alim.arreglo_alimentos(espinaca) + alim.arreglo_alimentos(lentejas);
        arr_enfermedades[anemia] = alim.arreglo_alimentos(brocoli) + alim.arreglo_alimentos(espinaca);
        arr_enfermedades[problDigestivos] = alim.arreglo_alimentos(chia) + alim.arreglo_alimentos(avena) + alim.arreglo_alimentos(berenjena) + alim.arreglo_alimentos(espinaca) + alim.arreglo_alimentos(canela) +alim.arreglo_alimentos(curcuma);
        
        return arr_enfermedades[n];
    }
    
    public String arreglo_alimentos(int n) {
        int numAlimentos = 15;
        String[] arr_alimentos = new String[numAlimentos];

        //Nombres Alimentos
        //Grasas
        int aceiteOliva = 0, aguacate = 1, chia = 2, nuez = 3;
        //Carbohidratos
        int avena = 4, brocoli = 5, berenjena = 6, champiñon = 7, espinaca = 8, patata = 9;
        //Proteinas
        int pescado = 10, huevo = 11, lentejas = 12;
        //Especias
        int canela = 13, curcuma = 14;

        arr_alimentos[aceiteOliva] = "\n\n\n\n--------Aceite de Oliva:-------- \n\n\nEl aceite vegetal más rico en ácidos grasos monoinsaturados, principalmente ácido oleico, que contribuyen a reducir el colesterol LDL y los triglicéridos y a aumentar el colesterol HDL. Contiene polifenoles y vitamina E, compuestos que sirven como antioxidantes.\n"
                + "\nBeneficio:\n\n"
                + "• Salud cardiovascular: Su poder antioxidante hace que este alimento, además de aportar sabor y tradición, sea uno de los mejores aliados de la salud cardiovascular.\n\n"
                + "• Protege el estómago: es la grasa mejor tolerada en el tracto digestivo, ya que no favorece el reflujo esofágico. Protege la mucosa del estómago al disminuir la secreción de jugo gástrico y favorecer la cicatrización, con lo que se reduce el tamaño de las úlceras. Además, favorece el tránsito de los alimentos por el intestino y potencia las propiedades desintoxicantes del hígado, favoreciendo la producción y liberación de la bilis. \n\n"
                + "• Huesos: mejora la mineralización de los huesos, ya que la oleuropeína, además de prevenir el estrés oxidativo, previene la pérdida de masa ósea. \n\n"
                + "Se debe elegir usar el aceite de oliva virgen o extra virgen, este último asegura su mayor riqueza en ácido oleico, polifenoles antioxidantes y vitamina E, así como unas cualidades \norganolépticas –olor, color y sabor– excepcionales.\n"
                + "\nPara consumirlo se recomienda tomarlo crudo en ensaladas y vinagretas o emplearlo en cocciones suaves como el salteado. Al calentarlo no debe humear puesto que esto indica \nque se está quemando, la temperatura mínima debe ser 160 ºC y que no exceda de 185 ºC.";

        arr_alimentos[aguacate] = "\n\n\n\n --------Aguacate:-------- \n\n\nEl 23% de su peso son grasas buenas monoinsaturadas, también es rico en vitamina E, que protege la membrana de las células y su núcleo por lo que puede prevenir el desarrollo de enfermedades degenerativas como el cáncer. \n\n"
                + "Aporta vitaminas A y C y minerales como potasio, calcio, magnesio, fósforo, hierro, cobre y cinc. \n\n\n"
                + "Beneficios: \n\n"
                + "• Salud Cardiovascular: tiende a reducirlo en el caso de estar elevado. Por eso es adecuado su consumo para prevenir la aparición de problemas como la aterosclerosis (falta de flexibilidad de las paredes arteriales) o enfermedades coronarias (angina de pecho o infarto de miocardio). Las grasas del aguacate insaturadas normalizan el colesterol, reduciendo el LDL y aumentando el HDL. \n\n"
                + "• Ayuda el sistema nervioso: es un excelente alimento regulador del sistema nervioso por su riqueza en ácidos grasos, magnesio y vitaminas del grupo B, por lo que está especialmente indicado en situaciones de estrés tanto físico como mental. \n\n"
                + "• Ayuda a la vista: su rico contenido de carotenoide luteína, cuyo efecto protector de la visión reduce el riesgo de desarrollar cataratas. \n\n";
        arr_alimentos[chia] = "\n\n\n\n--------Chía:-------- \n\n\nEstas semillas son ricas en grasas poliinsaturadas del tipo omega 3, en especial el alfanolénico. Además, su contenido de proteínas es alrededor del 20% y son una buena fuente de vitaminas del grupo B y de minerales como calcio y fósforo. \n\n"
                + "Beneficios: \n\n"
                + "• Baja el colesterol: Son un recurso de primer orden para reducir los triglicéridos y el colesterol LDL en sangre, al tiempo que incrementa el colesterol HDL. Reducen el riesgo de trombos, la agregación plaquetaria y la viscosidad sanguínea. \n\n"
                + "• Salud cardiovascular: Son un recurso de primer orden para reducir los triglicéridos y el colesterol LDL en sangre, al tiempo que incrementa el colesterol HDL. Reducen el riesgo de trombos, la agregación plaquetaria y la viscosidad sanguínea. \n\n"
                + "• Digestión: Son un recurso de primer orden para reducir los triglicéridos y el colesterol LDL en sangre, al tiempo que incrementa el colesterol HDL. Reducen el riesgo de trombos, la agregación plaquetaria y la viscosidad sanguínea. \n\n"
                + "Son un recurso de primer orden para reducir los triglicéridos y el colesterol LDL en sangre, al tiempo que incrementa el colesterol HDL. Reducen el riesgo de trombos, la agregación plaquetaria y la viscosidad sanguínea. \n";

        arr_alimentos[nuez] = "\n\n\n\n--------Nuez:--------\n\n\nEs el fruto seco más saludable gracias a la equilibrada composición de sus grasas, Con solo 25 g de nueces (5 piezas) se satisface el 91% de las necesidades diarias de ácidos grasos omega 3. También aporta proteínas (15%) y presenta un destacable porcentaje de vitamina E, vitaminas del grupo B, y minerales y oligoelementos como fósforo, magnesio, manganeso, cobre, cinc y hierro. \n\n"
                + "Beneficios: \n\n"
                + "• Salud cardiovascular: Los ácidos grasos omega-3 mejoran la relación entre colesterol HDL y LDL, y previenen los ritmos cardiacos erráticos y la formación de coágulos sanguíneos en las arterias, primera causa de infarto. \n\n"
                + "• Salud cerebral: benefician la salud cerebral, pues las neuronas los necesitan para funcionar correctamente. \n\n"
                + "• Por su efecto antiinflamatorio, las nueces ayudan en caso de asma, artritits o enfermedades de la piel como psoriasis. \n";

        arr_alimentos[avena] = "\n\n\n\n --------Avena:-------- \n\n\nEl contenido en hidratos de carbono de la avena es similar al de otras semillas, en torno al 60%. Se trata en su mayor parte de polisacáridos de absorción lenta, que proporcionan mayor sensación de saciedad después de comer, y van aportando energía de manera moderada pero constante. A este efecto contribuye su riqueza en fibra (6,7%). Con ello se evitan la debilidad, el cansancio y la ansiedad que llevan a comer entre horas y a desequilibrar la dieta. \n\n"
                + "Su aporte de proteínas (13,8%) es el más alto entre los cereales y contribuye altos aportes de fosforo, magnesio, hierro, manganeso y vitamina B1. Además, aporta algo de potasio, calcio, selenio, silicio, cobre, cinc y vitaminas E, B2 y B3, así como numerosos antioxidantes y antiinflamatorios como las avenantramidas. \n\n"
                + "Beneficios: \n\n"
                + "• Baja el colesterol: contiene una fibra soluble (betaglucano), consumir 3 gramos de esta ayuda a bajar el colesterol (75g de copos de avena contienen 3 gramos). Contiene lecitina y fitoesteroles como el avenasterol o el betasitosterol, que tiene efectos de control sobre el colesterol LDL. \n\n"
                + "• Controla el azúcar: Estimula la actividad del páncreas, y es una fuente de energía de asimilación lenta, y de fibra. Por ello es recomendable para diabéticos no insulino-dependientes al contribuir a estabilizar el azúcar en la sangre. \n\n"
                + "• Protege del cáncer: Es protectora frente a algunos tipos de cáncer, como los de colon, mama o próstata. \n\n"
                + "• Fortalece la musculatura: debido a su contenido de avenacósidos, que son esteroides anabólicos y son variantes químicas de la hormona testosterona. \n\n"
                + "• Ayuda el sistema nervioso La vitamina B1, el calcio y los alcaloides (indol, trigonelina o avenina) refuerzan el sistema nervioso a la vez que favorecen la capacidad para relajarse, concentrarse y prevenir el agotamiento mental. \n\n"
                + "• Digestión: Muchas personas con úlcera digestiva toman crema de avena diariamente para aliviar sus síntomas. También es útil en caso de pirosis, gastritis, estreñimiento (en decocción de grano entero) o diarrea (en decocción de grano sin cáscara) y flatulencias. \n";

        arr_alimentos[brocoli] = "\n\n\n\n--------Brócoli:-------- \n\n\nEste carbohidrato vegetal trae grandes beneficios para la salud, los estudios demuestran que tiene propiedades anticancerígenas, antianémicas, preventivas de la gastritis y reductoras de la función tiroidea y de la degeneración macular de la retina. \n\n"
                + "Beneficios: \n\n"
                + "• Protege del cáncer: Los compuestos presentes en las crucíferas son capaces de inhibir la expresión de dos genes relacionados con los cánceres de mama y próstata de origen genético: los BRCA1 y BRCA2. el brócoli puede actuar en el estómago como antibiótico y es capaz de disminuir la población de la bacteria Helicobacter pylori, uno de los causantes de la úlcera de estómago. \n\n"
                + "• Combate la anemia: su alto contenido en hierro, en clorofila y ácido fólico, hacen del brócoli un alimento muy recomendable para personas con anemia ferropénica, por déficit de hierro. \n\n"
                + "• En la menopausia: durante la menopausia es aconsejable su consumo pues contiene fitoestrógenos, con acción antiestrogénica similar a la de la soja, que permite paliar los síntomas de la menopausia. \n\n"
                + "• Depura el organismo: ejerce una acción hepática compleja y se ha utilizado como estimulante de la llamada \"depuración\" interna del organismo. Un papel importante de esta depuración se realiza a través del hígado. \n\n"
                + "Capaz de estimular el trabajo hepático, puede interferir en algunos medicamentos, reduciendo su efectividad. Además, está contraindicado en personas que padecen hipotiroidismo. \n\n"
                + "Para que disfrutes del sabor del brócoli a la vez que de sus propiedades anticáncer puedes prepararlo al vapor unos 5-7 minutos. \n";

        arr_alimentos[berenjena] = "\n\n\n\n --------Berenjena:--------\n\n\nEste alimento es muy ligero, debido a que principalmente está compuesto por agua (92,6%) y fibra de tipo soluble que favorece el buen estado de la flora bacteriana y ayuda a la eliminación de heces. \n\n"
                + "Destacan micronutrientes como el potasio y ácido fólico, también es rica en vitamina B6, B1 y magnesio. Además, contiene antocianinas que funcionan como antioxidante. \n\n"
                + "Tienen compuestos químicos específicos que se hallan sobre todo en la piel y las semillas. Estas sustancias (de sabor amargo) estimulan el buen funcionamiento del hígado y el vaciamiento de la vesícula biliar. \n\n"
                + "Beneficios: \n\n"
                + "• Digestión: La berenjena se puede considerar un alimento ligero y digestivo siempre que se cocine de manera apropiada. \n\n"
                + "• Baja el colesterol: Tanto la fibra como las sustancias químicas que se encuentran especialmente en la piel y las semillas contribuyen a mantener el colesterol en niveles óptimos. Algunos compuestos de la berenjena inhiben la síntesis de colesterol en el hígado, mientras que otros evitan que se oxide y se adhiera a las paredes arteriales. \n\n"
                + "• Controla el azúcar: Es apropiada para diabéticos porque contiene muy pocos hidratos de carbono, mucha fibra, que reduce la velocidad de absorción de los azúcares de otros alimentos, y sustancias que ayudan a mantenerlo bajo control, como la trigonelina.  \n\n"
                + "• Diurética: El mineral más abundante es el potasio y casi no contiene sodio, lo que favorece la eliminación de líquidos y reduce la presión arterial (si no se añade demasiada sal al cocinarla). Esto facilita el trabajo del corazón y apoya la función eliminadora de los riñones.  \n\n"
                + "• Ayuda el sistema nervioso: La presencia de vitamina B6, B1 y magnesio en cantidades significativas la indican para reforzar el sistema nervioso y mejorar el estado de ánimo. La vitamina B6 es especialmente recomendable durante el embarazo, pues previene la diabetes gestacional y alivia las náuseas. \n\n"
                + "• Antioxidante: contiene una decena de ácidos fenólicos antioxidantes muy potentes y antocianinas –pigmentos que dan el característico color oscuro a la piel– como la nasunina. Ambos tipos de compuestos impiden la oxidación del colesterol –una de las causas de que se convierta en un problema para la salud– y con ello previenen tanto los trastornos cardiovasculares como las enfermedades degenerativas. \n\n"
                + "las personas con tendencia a formar cálculos renales solo deben consumirlas ocasionalmente, pues contienen una gran cantidad de oxalatos, que favorecen la cristalización inicial. \n\n"
                + "Las maneras más saludables y digestivas de consumirla son asada entera al horno, a la plancha y luego aliñada ligeramente o trabajada en patés vegetales. \n";

        arr_alimentos[champiñon] = "\n\n\n\n --------Champiñón:-------- \n\n\nContiene pocos hidratos de carbono, poca fibra, mínimas grasas y proteínas escasas, su riqueza reside en las vitaminas del grupo B (B2, B3, B1 y ácido fólico), que cubren el 45%, el 42%, el 15% y el 18% de las necesidades diarias recomendadas, aumentando las defensas del organismo. \n\n"
                + "Abunda en potasio (418 mg en 100 g), con lo cual mejora la retención de líquidos; tiene un buen aporte en fósforo (27%) que favorece la actividad intelectual, así como en hierro, cobre y selenio (18% cada uno). \n\n"
                + "Beneficios: \n\n"
                + "• Protege del cáncer: el consumo regular de champiñones tiene poder anticancerígeno. Las últimas investigaciones apuntan a que su acción sobre el cáncer es debida a su riqueza en dos principios activos fundamentales: el selenio y cierto inhibidor de la aromatasa (enzima implicada en la producción de estrógenos que puede tener efectos cancerígenos en mujeres postmenopáusicas.). \n\n"
                + "• Próstata sana: por su riqueza en selenio, expertos nutricionistas norteamericanos señalan al champiñón como alimento adecuado para la salud prostática, así como para combatir el envejecimiento prematuro, la arteriosclerosis, la artritis reumatoide, la osteoporosis, la infertilidad o el acné. \n\n"
                + "• Sistema inmune: gracias a sus betaglucanos (uno de los compuestos que forman su fibra, junto con la quitina) como potenciador del sistema inmunitario. Además, la fibra alimentaria de los champiñones resulta beneficiosa para la prevención de las dolencias intestinales, incluido el cáncer de colon, y tiene un efecto saciante muy apropiado para regímenes de adelgazamiento. \n\n"
                + "Los champiñones más pequeños son ideales para emplear en ensaladas refrescantes o para elaborar salsas. También se pueden incluir enteros en estofados de carne o vegetarianos. \n\n"
                + "Los ejemplares medianos se pueden preparar fritos o a la plancha, preferiblemente cortados en láminas, mientras que los más grandes son ideales para rellenar hortalizas o lasañas o para utilizar en brochetas. \n";

        arr_alimentos[espinaca] = "\n\n\n\n--------Espinaca:--------\n\n\nEl poder nutritivo de la espinaca radica en su alto contenido en vitaminas y minerales: 100 g de esta verdura aportan dos tercios de las necesidades diarias de vitamina A, la práctica totalidad del ácido fólico, la mitad de la vitamina C y la cuarta parte del magnesio y el hierro que se precisan al día. Además, procura calcio, fósforo, azufre, clorofila, oligoelementos, enzimas y fibra. Sus proteínas (2,8%), aunque no son muy abundantes, son más completas que en otras hortalizas. \n\n"
                + "Benéficos: \n\n"
                + "• Anemia: La espinaca aporta 2,71 mg de hierro por cada 100 g, proporción que supera a la de la carne. Aunque el hierro de origen vegetal se absorbe con mayor dificultad que el de origen animal, la vitamina C, procedente tanto de la propia espinaca como de otros alimentos, favorece en parte su asimilación. \n\n"
                + "• Baja el colesterol: La fibra de la espinaca impide la absorción del colesterol y los ácidos biliares, mientras que sus antioxidantes reducen la oxidación del colesterol LDL y previenen la aterosclerosis. \n\n"
                + "• Digestión: Ayuda a depurar el hígado y resulta laxante. \n\n"
                + "• Hipertensión: Tres cucharadas diarias de jugo de espinacas ayudan a bajar la tensión en personas propensas. \n\n"
                + "• Sobrepeso: Al ser un alimento muy ligero (22 cal/100 g) y vitamínico resulta muy útil en dietas de adelgazamiento. \n\n"
                + "• Embarazo: Por su gran contenido en ácido fólico y su poder antianémico, la espinaca resulta ideal en el embarazo. \n\n"
                + "• Envejecimiento: Sus antioxidantes –también es rica en vitamina E– protegen la dermis del daño solar y del proceso natural de envejecimiento. \n\n"
                + "• Vista: La luteína y la zeaxantina ejercen una potente acción antioxidante sobre las células del sistema ocular y previenen la pérdida de agudeza visual por degeneración macular. \n\n"
                + "Existen muchas variedades, que se pueden tomar crudas, hervidas, al vapor, salteadas, gratinadas\n";

        arr_alimentos[patata] = "\n\n\n\n--------Patata:-------- \n\n\nEs una fuente muy razonable de energía que nos aporta más vitaminas y minerales y menos calorías de los que se le atribuyen normalmente. 200 gramos de patatas hervidas aportan el 20% de vitamina B1 que necesitamos, el 14% de vitamina B3 y el 24% de vitamina B6. Además, ofrecen una cantidad destacada de minerales. Los 200 gramos cubrirían el 8% de las necesidades diarias de selenio, el 22% de las de potasio, el 20% de las de flúor y el 14% de las de hierro. \n\n"
                + "Beneficios: \n\n"
                + "• Problemas gastrointestinales: La patata hervida, asada o al vapor es eficaz en casos de gastritis, estados febriles y acetona. En general se considera un alimento antiinflamatorio que puede aliviar las molestias digestivas asociadas al estrés. \n\n"
                + "• Control del azúcar: Favorecen la sensibilidad a la insulina (baja la tasa de azúcar en sangre) y disminuye las concentraciones de colesterol y triglicéridos. \n\n"
                + "• Ayuda el sistema inmune: contiene quercitina, carotenoides (en las variedades de carne amarilla), antocianinas (en las violáceas y azules), ácido clorogénico y ácidos cafeicos que ayudan al sistema inmunitario. \n";

        arr_alimentos[pescado] = "\n\n\n\n--------Pescado:-------- \n\n\nEn general, presentan un contenido calórico bajo, son buenas fuentes de proteínas de alto valor biológico, aportan vitaminas tanto hidrosolubles como liposolubles así como algunos minerales. Además, muchas especies son ricas en ácidos grasos poliinsaturados omega-3. \n\n"
                + "Su contenido proteico varía entre el 15 al 24% en función del tipo de pescado. Las proteínas son de alto valor biológico, al contener aminoácidos esenciales para la vida, particularmente metionina, cisteina, treonina, lisina y triptofano (imprescindible para la formación de la sangre). \n\n"
                + "El pescado contiene cantidades variables de vitaminas hidrosolubles, fundamentalmente B1, B2, B3. Algunos pescados como las sardinas, arenques, anchoas, son también ricos en vitamina B12. También contiene vitaminas liposolubles como la E, presente en diversos pescados en cantidades significativas y vitamina A y D abundante en su hígado.  \n\n"
                + "El pescado fresco supone un aporte importante de sodio, que se ve  incrementado en las conservas o cuando el pescado se somete al ahumado o curado. El hierro, está presente en mayor cantidad en los pescados de mar, que en los de agua dulce. También es una buena fuente de potasio y el aporte de calcio es significativo si se ingiere con espinas. Minerales como yodo, magnesio, fósforo o zinc se encuentran en menores proporciones. \n";

        arr_alimentos[huevo] = "\n\n\n\n--------Huevo:--------\n\n\nUn solo huevo aporta seis gramos de proteína y 14 nutrientes esenciales, incluyendo vitaminas A, B, D y E, además de ser fuente de calcio, selenio y yodo. Los huevos son uno de los alimentos más nutritivos disponibles a nivel mundial. \n\n"
                + "Beneficios: \n\n"
                + "• Contienen colina, un nutriente poco conocido que juega un papel importante en la construcción de membranas celulares, y participa en varias funciones vitales de nuestro cuerpo. Los huevos son una de las mejores fuentes naturales de colina. Ayuda al desarrollo saludable del cerebro. \n\n"
                + "• Son una gran fuente natural de vitamina A. La yema también contiene potentes antioxidantes que pueden contrarrestar algunos procesos degenerativos que afectan a nuestra visión. \n";

        arr_alimentos[lentejas] = "\n\n\n\n--------Lentejas:--------\n\n\nAporta buenas dosis de proteínas y fibra, así como una gran variedad de minerales, algunos en cantidades muy superiores a otros alimentos. Las lentejas contienen un 23,5% de proteínas, Pero las proteínas de la lenteja son pobres en metionina y cistina, lo que limita su aprovechamiento por el organismo, por lo que conviene consumir a lo largo del día otros alimentos que contengan estos aminoácidos, como el arroz, el trigo o el mijo. \n\n"
                + "Otro de sus puntos fuertes es su riqueza en minerales. Una sola ración (80 g en crudo) cubre un alto porcentaje de las necesidades diarias de los más significativos, como hierro, potasio, calcio, magnesio, fósforo, cinc y selenio. \n\n"
                + "Beneficios: \n\n"
                + "• Pocas calorías y muy nutritivas: son un alimento ligero que aporta solo 250 calorías por plato (unos 80 gramos de lentejas secas, la ración habitual por persona) haciéndolas apropiadas para menús de control de peso. \n\n"
                + "• Favorece el sistema nervioso: debido a su contenido en vitaminas del grupo B, en especial la B1, B2, B5, B6 y ácido fólico. Con la cocción se pierde parte de su aporte, pero si se toman germinadas se ve incrementado. \n\n"
                + "• Control del colesterol: La fibra soluble e insoluble de las lentejas (un 10% de su peso) absorbe el colesterol, y evita que llegue al flujo sanguíneo. Además, las lentejas contienen fitatos y antioxidantes con efecto anticolesterolemiante, mejorando el metabolismo celular y la utilización de ácidos grasos como fuente de energía para la célula. \\n";

        arr_alimentos[canela] = "\n\n\n\n--------Canela:--------\n\n\nLa canela se consume en poca cantidad, por lo tanto, no aporta nutrientes en dosis significativas. El aceite esencial aromático constituye hasta un 2,5% de su composición. Los compuestos mayoritarios son el aldehído cinámico (65-70%), el eugenol y el alcohol cinámico. \n\n"
                + "Beneficios: \n\n"
                + "• Digestión: estimula la secreción salivar y la actividad glandular. Resulta excelente por tanto en alteraciones gastrointestinales. Es eficaz contra la dispepsia, la insuficiencia de jugos gástricos, los gases y las náuseas. P ara regular la digestión, se toma el extracto de canela: un cuarto de cucharadita con agua, dos o tres veces al día; también se halla encapsulado, solo o en fórmulas digestivas: de 2.500 a 3.000 mg al día. La infusión o \"té de canela\" es una opción para quien prefiera el ritual de su preparación: basta media taza tras las comidas. \n\n"
                + "• Diabetes y pérdida de peso: mejora la sensibilidad de las células a la insulina y actúa significativamente sobre los niveles de glucosa en la sangre, incluso en personas con diabetes tipo 2. Además, la canela reduce las consecuencias negativas de comer alimentos ricos en grasa y con ello, junto con la acción sobre el azúcar, puede favorecer la pérdida de peso. Aún hay otra manera en que el azúcar ayuda a adelgazar: utilizarlo para sustituir el azúcar. Basta con una dosis de 1 g para obtener un efecto positivo sobre los niveles de glucosa. \n\n"
                + "• Enfermedad cardiaca: actúa sobre los niveles de colesterol malo LDL y sobre los triglicéridos. Un estudio concluyó que con solo 120 mg diarios se pueden conseguir efectos positivos, reduciendo así el riesgo de sufrir un infarto. \n\n"
                + "La canela –sobre todo la variedad cassia– contine una pequeña cantidad de cumaria. Esta sustancia, en dosis extremadamente altas, puede causar algunos efectos secundarios peligrosos. \n";

        arr_alimentos[curcuma] = "\n\n\n\n--------Cúrcuma:--------\n\n\nContienen curcumoides y curcuminas, materias colorantes a las que se atribuyen claros efectos antioxidantes y antiinflamatorios. Contienen asimismo un aceite esencial con zingibereno, polisacáridos y sales minerales como hierro y potasio. \n\n"
                + "Beneficios: \n\n"
                + "• Sus virtudes antiinflamatorias la convierten en una ayuda contra la artritis, el síndrome de colon irritable o cualquier proceso inflamatorio. \n\n"
                + "• Favorece la digestión (ayuda ante los gases o la hinchazón), porque estimula la secreción de bilis y favorece el buen funcionamiento del hígado. \n\n"
                + "• La curumina resulta asimismo ventajosa para el sistema cardiovascular. También tiene algo que aportar frente a las enfermedades neurodegenerativas y el Alzheimer en especial. \n\n"
                + "• Refuerza el hígado, elevando las tasas de las enzimas que eliminan compuestos tóxicos. \n\n"
                + "• Inhibe la síntesis de proteínas necesarias para que se desarrollen tumores. \n\n"
                + "• Previene el desarrollo de los vasos sanguíneos que los alimentan. \n\n"
                + "Tomar cúrcuma a dosis altas durante largos periodos de tiempo en forma de complemento alimentario puede presentar algunos riesgos como dificultad para absorber el hierro, daño hepático. No conviene durante el embrazo ni la lactancia. \n";

        return arr_alimentos[n];
    }
    
    public String frasesMotivacionales(int n){
        String[] arr_frases = new String[13];
        arr_frases[0] = "\"Dime lo que comes y te diré quién eres\"\n(Anthelme Brillat-Savarín)";
        arr_frases[1] = "\"Aquellos que piensan que no tienen tiempo para una alimentación saludable tarde o temprano encontrarán tiempo para la enfermedad\"\n(Edward Stanley)";
        arr_frases[2] = "\"Deje que los alimentos sean su medicina y que la medicina sea su alimento\"\n(Hipócrates)";
        arr_frases[3] = "\"Comer es una necesidad, pero comer de forma inteligente es un arte\"\n(Francisco VI)";
        arr_frases[4] = "\"La única manera de conservar la salud es comer lo que no quieres, beber lo que no te gusta y hacer lo que preferirías no hacer\"\n(Mark Twain)";
        arr_frases[5] = "\"Un exterior saludable comienza en tu interior\"(Robert Urich)";
        arr_frases[6] = "\"Mantener el cuerpo en buena salud es un deber; de lo contrario, no podremos mantener nuestra mente fuerte y clara\"(Buda)";
        arr_frases[7] = "\"La mayor riqueza de una persona es su salud\"(Virgil)";
        arr_frases[8] = "\"Si no puedes pronunciarlo, no lo comas\"(Sentido común)";
        arr_frases[9] = "\"Nuestros cuerpos son nuestros jardines, nuestras voluntades son nuestros jardineros\"(William Shakespeare)";
        arr_frases[10] = "\"Aquellos que piensan que no tienen tiempo para una alimentación saludable, tarde o temprano encontrarán tiempo para la enfermedad\"(Edward Stanley)";
        arr_frases[11] = "\"La nutrición óptima es la medicina del mañana\"(Dr. Linus Pauling)";
        arr_frases[12] = "\"Una manzana al día mantiene al doctor alejado\"(Proverbio)";
        
        return arr_frases[n];
    }
}
