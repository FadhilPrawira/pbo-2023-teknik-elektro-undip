<?php

$datetime_1 = '2021-03-1 11:15:30'; 
$datetime_2 = '2022-04-12 13:30:45'; 
 
$start_datetime = new DateTime($datetime_1);
$end_datetime = new DateTime($datetime_2); 
$diff = date_diff($start_datetime, $end_datetime);
// echo $diff->days." Days total\n"; 
// echo $diff->y." Years\n"; 
// echo $diff->m." Months\n"; 
// echo $diff->d." Days\n"; 
// echo $diff->h." Hours\n"; 
// echo $diff->i." Minutes\n"; 
// echo $diff->s." Seconds\n";
var_dump($diff);